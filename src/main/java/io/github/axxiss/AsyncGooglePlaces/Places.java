package io.github.axxiss.AsyncGooglePlaces;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import io.github.axxiss.AsyncGooglePlaces.model.Place;

import java.lang.reflect.Type;

/**
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

    private static void get(final String url, final RequestParams params, final PlacesCallback callback) {
        AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String asyncResponse) {
                Place[] response = null;
                Gson gson = new Gson();

                Type token = new TypeToken<Place[]>() {}.getType();

                try {
                    response = gson.fromJson(asyncResponse, token);
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    callback.onException(e);
                }

                if (response == null) {
                    callback.onException(new NullPointerException());
                } else {
                    callback.onSuccess(response);
                }
            }

            @Override
            public void onFailure(Throwable error, String content) {
                callback.onException(new Exception(error));
            }
        };

        mHttpClient.get(url, params, handler);
    }

//    /**
//     * Get the absolute URL where the request will be sent.
//     *
//     * @param relativeUrl
//     * @return
//     */
//    public static String getAbsoluteUrl(String relativeUrl) {
//
//        String url = new String(BASE_URL + relativeUrl);
//        Log.i(TAG, "API: " + url);
//
//        return url;
//    }
//
//    /**
//     * Do a nearby search.
//     * @param query
//     * @param callback
//     */
//    public static void searchNearby(final String query, final PlacesCallback callback){
//
//        RequestParams params = new RequestParams();
//        params.put();
//
//
//        mHttpClient.get("");
//
//    }
}
