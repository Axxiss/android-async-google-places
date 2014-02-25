package io.github.axxiss.places.request;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

import io.github.axxiss.places.Response;
import io.github.axxiss.places.callback.PlacesCallback;
import io.github.axxiss.places.enums.Params;
import io.github.axxiss.places.enums.Request;
import io.github.axxiss.places.enums.Status;
import io.github.axxiss.places.exception.ApiPlacesException;

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
    public static void sendRequest(final Request request, final PlaceParams params, final PlacesCallback callback) {

        String url = BASE + request.getValue();

        if (request == Request.Photo) {
            url += "?";
        } else {
            url += OUTPUT;
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


        RequestParams parameters = new RequestParams();

        Set<Map.Entry<Params, String>> entries = params.getParams().entrySet();

        for (Map.Entry<Params, String> entry : entries) {
            parameters.put(entry.getKey().getValue(), entry.getValue());
        }
        Log.d(TAG, parameters.toString());

        mHttpClient.get(url, parameters, handler);
    }

    /**
     * Parse the response, and call the corresponding callback method.
     *
     * @param asyncResponse
     * @param callback
     */
    private static void parseResponse(String asyncResponse, final PlacesCallback callback) {
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

            if (response.getStatus().equals(Status.OK.toString())) {
                callback.onSuccess(response);
            } else {
                callback.onException(new ApiPlacesException(response.getStatus()));
            }
        }
    }
}
