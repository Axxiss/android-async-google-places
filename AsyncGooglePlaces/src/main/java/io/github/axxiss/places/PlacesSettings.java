package io.github.axxiss.places;

/**
 * @author Axxiss
 */
public class PlacesSettings {
    private static final String TAG = "PlacesSettings";

    private static PlacesSettings sInstance;

    /**
     * Google PlaceSearch API key.
     */
    private String mApiKey;

    private PlacesSettings() {
    }

    public static PlacesSettings getInstance() {
        if (sInstance == null) {
            sInstance = new PlacesSettings();
        }

        return sInstance;
    }

    public String getApiKey() {
        return mApiKey;
    }

    public void setApiKey(final String apiKey) {
        mApiKey = apiKey;
    }
}
