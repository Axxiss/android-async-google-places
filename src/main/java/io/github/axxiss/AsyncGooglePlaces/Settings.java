package io.github.axxiss.AsyncGooglePlaces;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public class Settings {
    private static final String TAG = "Settings";

    private static Settings sInstance;

    /**
     * Google Places API key.
     */
    private String mApiKey;

    private Settings() {
    }

    public static Settings getInstance() {
        if (sInstance == null) {
            sInstance = new Settings();
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
