package io.github.axxiss.AsyncGooglePlaces.request;

import com.loopj.android.http.RequestParams;
import io.github.axxiss.AsyncGooglePlaces.PlacesSettings;

/**
 * @author Axxiss
 */
public class PlacesParams extends RequestParams {
    private static final String TAG = "PlacesParams";

    public void put(String key, boolean value) {
        put(key, String.valueOf(value));
    }

    public void put(String key, int value) {
        put(key, String.valueOf(value));
    }

    public PlacesParams() {
        put(Params.KEY.getValue(), PlacesSettings.getInstance().getApiKey());
        put(Params.SENSOR.getValue(), "true");
    }
}
