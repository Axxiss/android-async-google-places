package io.github.axxiss.AsyncGooglePlaces.model;

import com.loopj.android.http.RequestParams;
import io.github.axxiss.AsyncGooglePlaces.Settings;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public class PlacesParams extends RequestParams {
    private static final String TAG = "PlacesParams";

    public void put(String key, boolean value) {
        put(key, String.valueOf(value));
    }

    public PlacesParams(boolean sensor) {
        put(Params.KEY.getValue(), Settings.getInstance().getApiKey());
        put(Params.REFERENCE.getValue(), "");
        put(Params.SENSOR.getValue(), sensor);
    }
}
