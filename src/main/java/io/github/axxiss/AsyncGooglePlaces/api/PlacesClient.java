package io.github.axxiss.AsyncGooglePlaces.api;

import io.github.axxiss.AsyncGooglePlaces.model.PlaceOverview;
import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public class PlacesClient {
    private static final String TAG = "PlacesClient";

    private static final String API_URL = "https://maps.googleapis.com/maps/api/place";

    /**
     * Places API interface.
     */
    private final RestAdapter mRestAdapter;

    /**
     * Places API client.
     */
    private final GooglePlaces mClient;

    private String mApiKey;

    private boolean mSensor;

    public PlacesClient(String apiKey, boolean sensor) {
        mRestAdapter = new RestAdapter.Builder().setServer(API_URL).build();

        mClient = mRestAdapter.create(GooglePlaces.class);

        mApiKey = apiKey;
        mSensor = sensor;
    }

    /**
     * Send a localized search request. The {@link Response} will contain an array of {@link io.github.axxiss
     * .AsyncGooglePlaces.model.PlaceOverview}
     * as result.
     *
     * @param query The query
     */
    public void textSearch(final String query, final double lat, final double lng, int radius, RequestParams params) {
        params.setLocation(lat, lng).setRadius(radius).setQuery(query);
        //TODO: make request
    }

    /**
     * Set mandatory params of nearby search request.
     *
     * @param lat
     * @param lng
     * @param radius
     * @param params optional params.
     */
    public void nearbySearch(final double lat, final double lng, int radius, RequestParams params,
                             Callback<PlaceOverview[]> cb) {
        params.setLocation(lat, lng).setRadius(radius);

        mClient.nearbySearch(params.getParams(), cb);
    }

    public void nearbySearch(final double lat, final double lng, int radius, Callback<PlaceOverview[]> cb) {
        nearbySearch(lat, lng, radius, new RequestParams(), cb);
    }

    /**
     * Send a localized search request. The {@link Response} will contain an array of {@link io.github.axxiss
     * .AsyncGooglePlaces.model.PlaceOverview}
     * as result.
     *
     * @param query The query
     */
    public void textSearch(final String query, final double lat, final double lng, int radius) {
        textSearch(query, lat, lng, radius, new RequestParams());
    }
}
