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

//    /**
//     * Android async http client.
//     */
//    private static AsyncHttpClient mHttpClient = new AsyncHttpClient();
//
//    /**
//     * Send an request to the specified URL
//     *
//     * @param params   reuqest's params
//     * @param callback
//     */
//    public static void sendRequest(final RequestParams params, final PlacesCallback callback) {
//
//        final String url = params.getUrl();
//
//        AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {
//            @Override
//            public void onSuccess(String asyncResponse) {
//                Log.d(TAG, asyncResponse);
//
//                Response response = null;
//                Gson gson = new Gson();
//
//                Type token = new TypeToken<Response>() {}.getType();
//
//                try {
//                    response = gson.fromJson(asyncResponse, token);
//                } catch (JsonSyntaxException e) {
//                    e.printStackTrace();
//                    callback.onException(e);
//                }
//
//                if (response == null) {
//                    callback.onException(new NullPointerException());
//                } else {
//
//                    if (response.getStatus().equals(Status.OK)) {
//                        callback.onSuccess(response);
//                    } else {
//                        callback.onException(new ApiPlacesException(response.getStatus()));
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Throwable error, String content) {
//                Log.d(TAG, content);
//                callback.onException(new Exception(error));
//            }
//        };
//        Log.d(TAG, url);
//        Log.d(TAG, params.toString());
//        mHttpClient.get(url, params, handler);
//    }

    /**
     * Send a localized search request. The {@link Response} will contain an array of {@link io.github.axxiss
     * .AsyncGooglePlaces.model.PlaceOverview}
     * as result.
     *
     * @param query The query
     */
    public static RequestParams textSearch(final String query, final double lat, final double lng, int radius) {
        RequestParams params = new RequestParams();
        params.setUrl(TEXT);
        params.setLocation(lat, lng).setRadius(radius).setQuery(query);
        return params;
    }

    /**
     * Set mandatory params of nearby search request.
     *
     * @param lat
     * @param lng
     * @param radius
     * @return request params.
     */
    public static RequestParams nearbySearch(final double lat, final double lng, int radius) {
        RequestParams params = new RequestParams();
        params.setUrl(NEARBY);
        params.setLocation(lat, lng).setRadius(radius);
        return params;
    }

//    /**
//     * Download an icon's image.
//     *
//     * @param url      icon's url obtained from {@link io.github.axxiss.AsyncGooglePlaces.model
// .PlaceOverview#getIcon()}
//     * @param callback
//     */
//    public static void downloadIcon(String url, final PlacesCallback callback) {
//
//        BinaryHttpResponseHandler handler = new BinaryHttpResponseHandler() {
//            @Override
//            public void onSuccess(byte[] data) {
//                if (data == null) {
//                    callback.onException(new NullPointerException());
//                }
//
//                Bitmap b = BitmapFactory.decodeByteArray(data, 0, data.length);
//
//                callback.onSuccess(b);
//            }
//
//            @Override
//            public void onFailure(Throwable error, String content) {
//                Log.d(TAG, content);
//                callback.onException(new Exception(error));
//            }
//        };
//
//        mHttpClient.get(url, handler);
//    }

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
