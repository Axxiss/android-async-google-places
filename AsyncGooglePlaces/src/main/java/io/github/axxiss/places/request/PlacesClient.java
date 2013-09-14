package io.github.axxiss.places.request;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.lang.reflect.Type;

import io.github.axxiss.places.ApiPlacesException;
import io.github.axxiss.places.Response;
import io.github.axxiss.places.callback.PlaceCallback;
import io.github.axxiss.places.enums.Status;

/**
 * Here is where the request to the server is setted up and launched.
 *
 * @author Axxiss
 */
public class PlacesClient {
    private static final String TAG = "PlacesClient";

    private static final String BASE = "https://maps.googleapis.com/maps/api/place/";
    private static final String OUTPUT = "/json?";


    private static AsyncHttpClient mHttpClient = new AsyncHttpClient();

    /**
     * Send an request to Google Places API
     *
     * @param params   request's params
     * @param callback
     */
    public static void sendRequest(final PlaceParams params, final PlaceCallback callback) {

        String url = params.getUrl();

        if (url.equals(PlacePhotos.PHOTO)) {
            url = BASE + url + "?";
        } else {
            url = BASE + url + OUTPUT;
        }

        AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String asyncResponse) {
                parseResponse(asyncResponse, callback);
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
     * Parse the response, and call the corresponding callback method.
     *
     * @param asyncResponse
     * @param callback
     */
    private static void parseResponse(String asyncResponse, final PlaceCallback callback) {
        Log.d(TAG, asyncResponse);

        Response response = null;
        Gson gson = new Gson();

        Type token = new TypeToken<Response>() {
        }.getType();

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
}
