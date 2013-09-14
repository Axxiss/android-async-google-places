package io.github.axxiss.places.api;

/**
 * The Google Places API allows you to query for place information on a variety of categories, such
 * as: establishments, prominent points of interest, geographic locations, and more. You can search
 * for places either by proximity or a text string. A Place Search returns a list of Places along
 * with summary information about each Place; additional information is available via a Place
 * Details query.
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
     * Send a localized search request. The {@link Response} will contain an array of {@link
     * io.github.axxiss .AsyncGooglePlaces.model.Place} as result.
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

    /**
     * The Google Places API Radar Search Service allows you to search for up to 200 Places at once,
     * but with less detail than is typically returned from a Text Search or Nearby Search request.
     * With Radar Search, you can create applications that help users identify specific areas of
     * interest within a geographic area. The search response will include up to 200 Places,
     * identified only by their geographic coordinates and Place reference. You can send a Place
     * Details request for more information about any of the Places in the response.
     *
     * @param lat    The latitude around which to retrieve Place information.
     * @param lng    The longitude around which to retrieve Place information.
     * @param radius Defines the distance (in meters) within which to return Place results. The
     *               maximum allowed radius is 50 000 meters.
     * @return
     */
    public static PlaceParams radarSearch(final double lat, final double lng, int radius) {
        PlaceParams params = new PlaceParams();
        params.setUrl(RADAR);
        params.setRadius(radius);
        return params;
    }
}
