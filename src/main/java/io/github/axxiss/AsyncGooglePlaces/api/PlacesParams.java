package io.github.axxiss.AsyncGooglePlaces.api;

import com.loopj.android.http.RequestParams;
import io.github.axxiss.AsyncGooglePlaces.PlacesSettings;
import io.github.axxiss.AsyncGooglePlaces.api.enums.Params;
import io.github.axxiss.AsyncGooglePlaces.api.enums.Place;
import io.github.axxiss.AsyncGooglePlaces.api.enums.RankBy;

/**
 * @author Axxiss
 */
public class PlacesParams extends RequestParams {
    private static final String TAG = "PlacesParams";

    private String mUrl;

    public PlacesParams() {
        put(Params.KEY.getValue(), PlacesSettings.getInstance().getApiKey());
        put(Params.SENSOR.getValue(), "true");
    }

    protected void put(String key, boolean value) {
        put(key, String.valueOf(value));
    }

    protected void put(String key, int value) {
        put(key, String.valueOf(value));
    }

    protected String getUrl() {
        return mUrl;
    }

    protected void setUrl(final String url) {
        mUrl = url;
    }

    public PlacesParams setRankBy(RankBy rankBy) {
        put(Params.RANK_BY.getValue(), rankBy.getvalue());
        return this;
    }

    public PlacesParams setRadius(int radius) {
        if (radius > 0) {
            put(Params.RADIUS.getValue(), radius);
        } else {
            setRankBy(RankBy.DISTANCE);
        }
        return this;
    }

    public PlacesParams setLocation(final double lat, final double lng) {
        String location = String.format("%s,%s", String.valueOf(lat), String.valueOf(lng));
        put(Params.LOCATION.getValue(), location);
        return this;
    }

    public PlacesParams setQuery(String query) {
        if (query != null) {
            put(Params.QUERY.getValue(), query);
        }
        return this;
    }

    public PlacesParams setTypes(Place[] places) {
        final String divider = "|";
        String types = "";
        for (Place place : places) {
            types = place.getValue() + divider;
        }

        types.substring(0, types.length() - 1);

        put(Params.TYPES.getValue(), types);
        return this;
    }

    public PlacesParams setLanguage(String langCode) {
        put(Params.LANGUAGE.getValue(), langCode);

        return this;
    }

    public PlacesParams setKeyword(String keyword) {
        put(Params.KEYWORD.getValue(), keyword);
        return this;
    }
}
