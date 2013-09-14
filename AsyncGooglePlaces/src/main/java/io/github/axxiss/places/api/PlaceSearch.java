package io.github.axxiss.places.api;

import com.loopj.android.http.AsyncHttpClient;

/**
 * The Google Places API allows you to query for place information on a variety of categories, such
 * as: establishments, prominent points of interest, geographic locations, and more. You can search
 * for places either by proximity or a text string. A Place Search returns a list of Places along
 * with summary information about each Place; additional information is available via a
 * Place Details query.
 * <p/>
 * Before starting with the requests, {@link io.github.axxiss.places.PlacesSettings#setApiKey(String)}
 * must be called.
 * <p/>
 *
 * @author Axxiss
 */
public class PlaceSearch {
    public static final int FLAG_RANK_BY_DISTANCE = -1;
    private static final String TAG = "PlaceSearch";
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
     * Send a localized search request. The {@link Response} will contain an array of {@link io.github.axxiss
     * .AsyncGooglePlaces.model.Place}
     * as result.
     *
     * @param query The query
     */
    public static PlaceParams textSearch(final String query, final double lat, final double lng, int radius) {
        PlaceParams params = new PlaceParams();
        params.setUrl(TEXT);
        params.setLocation(lat, lng).setRadius(radius).setQuery(query);
        return params;
    }

    /**
     * A Nearby Search lets you search for Places within a specified area. You can refine your
     * search request by supplying keywords or specifying the type of Place you are searching for.
     *
     * @param lat
     * @param lng
     * @param radius
     * @return request params.
     */
    public static PlaceParams nearbySearch(final double lat, final double lng, int radius) {
        PlaceParams params = new PlaceParams();
        params.setUrl(NEARBY);
        params.setLocation(lat, lng).setRadius(radius);
        return params;
    }
}
