package io.github.axxiss.AsyncGooglePlaces.api;

/**
 * Before starting with the requests, {@link io.github.axxiss.AsyncGooglePlaces.PlacesSettings#setApiKey(String)}
 * must be called.
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
     * Possible response status value.
     */
    private static final class Status {
        private static final String OK = "OK";

        private static final String UNKNOW_ERROR = "UNKNOW_ERROR";

        private static final String ZERO_RESULTS = "ZERO_RESULTS";

        private static final String OVER_QUERY_LIMIT = "OVER_QUERY_LIMIT";

        private static final String INVALID_REQUEST = "INVALID_REQUEST";

        private static final String NOT_FOUND = "NOT_FOUND";
    }
}
