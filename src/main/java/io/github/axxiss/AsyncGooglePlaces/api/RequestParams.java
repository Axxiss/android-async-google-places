package io.github.axxiss.AsyncGooglePlaces.api;

import io.github.axxiss.AsyncGooglePlaces.PlacesSettings;
import io.github.axxiss.AsyncGooglePlaces.api.enums.Lang;
import io.github.axxiss.AsyncGooglePlaces.api.enums.Params;
import io.github.axxiss.AsyncGooglePlaces.api.enums.Place;
import io.github.axxiss.AsyncGooglePlaces.api.enums.RankBy;

import java.util.HashMap;

/**
 * @author Axxiss
 */
public class RequestParams {
    private static final String TAG = "PlacesParams";

    /**
     * Relative request's URL. This will be appended to {@link PlacesClient#API_URL}.
     */
    private String mUrl;

    /**
     * Key-value set to store request's params.
     */
    private HashMap<String, String> mParams = new HashMap<String, String>();

    /**
     * Create a request params with the provided API key and sensor param.
     *
     * @param sensor true if the location is provided by a device
     * @see {@link PlacesSettings#setApiKey(String)}.
     */
    public RequestParams(boolean sensor) {
        setSensor(sensor);
        setApiKey(PlacesSettings.getInstance().getApiKey());
    }

    public RequestParams() {
        this(true);
    }

    public HashMap<String, String> getParams() {
        return mParams;
    }

    protected String getUrl() {
        return mUrl;
    }

    protected void setUrl(final String url) {
        mUrl = url;
    }

    /**
     * Specifies the order in which results are listed. Possible values are defined on {@link RankBy}
     *
     * @param rankBy result's order
     * @return
     */
    public RequestParams setRankBy(RankBy rankBy) {
        mParams.put(Params.RANK_BY.getValue(), rankBy.getvalue());
        return this;
    }

    /**
     * Defines the distance (in meters) within which to return Place results. The maximum allowed radius is 50 000
     * meters. Note that radius must not be included if {@code rankby=distance} is specified.
     *
     * @param radius
     * @return
     * @see {@link #setRankBy(io.github.axxiss.AsyncGooglePlaces.api.enums.RankBy)}
     */
    public RequestParams setRadius(int radius) {
        if (radius > 0) {
            mParams.put(Params.RADIUS.getValue(), String.valueOf(radius));
        } else {
            setRankBy(RankBy.DISTANCE);
        }
        return this;
    }

    /**
     * The latitude/longitude around which to retrieve Place information.
     *
     * @param lat the latitude.
     * @param lng the longitude.
     * @return
     */
    public RequestParams setLocation(final double lat, final double lng) {
        String location = String.format("%s,%s", String.valueOf(lat), String.valueOf(lng));
        mParams.put(Params.LOCATION.getValue(), location);
        return this;
    }

    /**
     * The text string on which to search, for example: "restaurant". The Place service will return candidate matches
     * based on this string and order the results based on their perceived relevance.
     *
     * @param query the query.
     * @return
     */
    public RequestParams setQuery(String query) {
        if (query != null) {
            mParams.put(Params.QUERY.getValue(), query);
        }
        return this;
    }

    /**
     * Restricts the results to Places matching at least one of the specified types.
     *
     * @param places places' types
     * @return
     * @see {@link Place}
     */
    public RequestParams setTypes(Place... places) {
        final String divider = "|";
        String types = "";
        for (Place place : places) {
            types += place.getValue() + divider;
        }

        types.substring(0, types.length() - 1);

        mParams.put(Params.TYPES.getValue(), types);
        return this;
    }

    /**
     * The language code, indicating in which language the results should be returned, if possible.
     * See the list of supported languages and their codes. Note that we often update supported languages so this list
     * may not be exhaustive.
     *
     * @param langCode the language code.
     * @return
     */
    public RequestParams setLanguage(Lang langCode) {
        mParams.put(Params.LANGUAGE.getValue(), langCode.getValue());
        return this;
    }

    /**
     * A term to be matched against all content that Google has indexed for this Place, including but not limited to
     * name, type, and address, as well as customer reviews and other third-party content.
     *
     * @param keyword the keyword.
     * @return
     */
    public RequestParams setKeyword(String keyword) {
        mParams.put(Params.KEYWORD.getValue(), keyword);
        return this;
    }

    /**
     * Indicates whether or not the Place request came from a device using a location sensor (e.g. a GPS) to determine
     * the location sent in this request. True by default.
     *
     * @param sensor
     * @return
     */
    public RequestParams setSensor(boolean sensor) {
        mParams.put(Params.SENSOR.getValue(), String.valueOf(sensor));
        return this;
    }

    /**
     * Your application's API key. This key identifies your application for purposes of quota management and so that
     * Places added from your application are made immediately available to your app. Visit the
     * <a href="https://code.google.com/apis/console">APIs Console</a> to create  an API Project and obtain your key.
     *
     * @param apiKey
     * @return
     */
    public RequestParams setApiKey(String apiKey) {
        mParams.put(Params.KEY.getValue(), apiKey);
        return this;
    }
}
