package io.github.axxiss.AsyncGooglePlaces;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import io.github.axxiss.AsyncGooglePlaces.request.Params;
import io.github.axxiss.AsyncGooglePlaces.request.PlacesParams;
import io.github.axxiss.AsyncGooglePlaces.request.Response;

import java.lang.reflect.Type;

/**
 * Before starting with the requests, {@link PlacesSettings#setApiKey(String)} must be called.
 *
 * @author Axxiss
 */
public class Places {
    private static final String TAG = "Places";

    private static final String BASE = "https://maps.googleapis.com/maps/api/place/";

    private static final String OUTPUT = "/json?";

    private static final String NEARBY = BASE + "nearbysearch" + OUTPUT;

    private static final String TEXT = BASE + "textsearch" + OUTPUT;

    private static final String RADAR = BASE + "radarsearch" + OUTPUT;

    private static final String AUTO = BASE + "autocomplete" + OUTPUT;

    private static final String QUERY = BASE + "queryautocomplete" + OUTPUT;

    private static final String DETAILS = BASE + "details" + OUTPUT;

    private static final String PHOTO = BASE + "photo?";

    /**
     * Android async http client.
     */
    private static AsyncHttpClient mHttpClient = new AsyncHttpClient();

    /**
     * Send an request to the specified URL
     *
     * @param url      request's url.
     * @param params   reuqest's params
     * @param callback
     */
    private static void sendRequest(final String url, final RequestParams params, final PlacesCallback callback) {
        AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String asyncResponse) {
                Log.d(TAG, asyncResponse);

                Response response = null;
                Gson gson = new Gson();

                Type token = new TypeToken<Response>() {}.getType();

                try {
                    response = gson.fromJson(asyncResponse, token);
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    callback.onException(e);
                }

                if (response == null) {
                    callback.onException(new NullPointerException());
                } else {

                    if (response.getStatus().equals(Status.OK)) {
                        callback.onSuccess(response);
                    } else {
                        callback.onException(new ApiPlacesException(response.getStatus()));
                    }
                }
            }

            @Override
            public void onFailure(Throwable error, String content) {
                Log.d(TAG, content);
                callback.onException(new Exception(error));
            }
        };
        Log.d(TAG, url);
        Log.d(TAG, params.toString());
        mHttpClient.get(url, params, handler);
    }

    /**
     * Send a localized search request. The {@link Response} will contain an array of {@link io.github.axxiss
     * .AsyncGooglePlaces.model.PlaceOverview}
     * as result.
     *
     * @param query    The query
     * @param callback
     */
    public static void textSearch(final String query, final double lat, final double lng, int radius,
                                  final PlacesCallback callback) {
        String location = String.format("%s,%s", String.valueOf(lat), String.valueOf(lng));

        PlacesParams params = new PlacesParams();
        params.put(Params.LOCATION.getValue(), location);
        params.put(Params.QUERY.getValue(), query);
        params.put(Params.RADIUS.getValue(), radius);

        sendRequest(TEXT, params, callback);
    }

    /**
     * Request a nearby search.
     *
     * @param type     filter the search to one type
     * @param lat
     * @param lng
     * @param radius
     * @param callback
     */
    public static void nearbySearch(final Place type, final double lat, final double lng, int radius,
                                    final PlacesCallback callback) {
        String location = String.format("%s,%s", String.valueOf(lat), String.valueOf(lng));

        PlacesParams params = new PlacesParams();
        params.put(Params.LOCATION.getValue(), location);
        params.put(Params.RADIUS.getValue(), radius);

        if (type != null) {
            params.put(Params.TYPE.getValue(), type.getValue());
        }

        sendRequest(NEARBY, params, callback);
    }

    /**
     * Download an icon's image.
     *
     * @param url      icon's url obtained from {@link io.github.axxiss.AsyncGooglePlaces.model.PlaceOverview#getIcon()}
     * @param callback
     */
    public static void downloadIcon(String url, final PlacesCallback callback) {

        BinaryHttpResponseHandler handler = new BinaryHttpResponseHandler() {
            @Override
            public void onSuccess(byte[] data) {
                if (data == null) {
                    callback.onException(new NullPointerException());
                }

                Bitmap b = BitmapFactory.decodeByteArray(data, 0, data.length);

                callback.onSuccess(b);
            }

            @Override
            public void onFailure(Throwable error, String content) {
                Log.d(TAG, content);
                callback.onException(new Exception(error));
            }
        };

        mHttpClient.get(url, handler);
    }

    /**
     * Possible response status value.
     */
    private static final class Status {
        private static final String OK = "OK";

        private static final String UNKNOW_ERROR = "UNKNOW_ERROR";

        private static final String ZERO_RESULTS = "ZERO_RESULTS";

        private static final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";

        private static final String INVALID_REQUEST = "INVALID_REQUEST";

        private static final String NOT_FOUND = "NOT_FOUND";
    }
}
