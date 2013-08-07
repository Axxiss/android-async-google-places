package io.github.axxiss.AsyncGooglePlaces.api;

import retrofit.RestAdapter;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public class PlacesClient {
    private static final String TAG = "PlacesClient";

    private static final String API_URL = "https://maps.googleapis.com/maps/api/place";

    private final RestAdapter mRestAdapter;

    private final GooglePlaces mClient;

    public PlacesClient() {
        mRestAdapter = new RestAdapter.Builder().setServer(API_URL).build();
        ;

        mClient = mRestAdapter.create(GooglePlaces.class);
    }
}
