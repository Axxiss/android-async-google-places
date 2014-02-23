package io.github.axxiss.places.request;

import io.github.axxiss.places.callback.PlacesCallback;
import io.github.axxiss.places.enums.Params;
import io.github.axxiss.places.enums.Request;

/**
 * Build the request for a localized search request. The {@link io.github.axxiss.places.Response}
 * will contain an array of {@link io.github.axxiss .AsyncGooglePlaces.model.Place} as result.
 */
public class TextSearch extends BaseSearch {

    protected PlaceParams params = new PlaceParams();

    public TextSearch(final String query, final double lat, final double lng, int radius) {
        super(Request.TextSearch);
        params.put(Params.Query, query);
        setLocation(lat, lng);
        params.put(Params.Radius, radius);
    }

    public TextSearch setKeyword(String keyword) {
        params.put(Params.Keyword, keyword);
        return this;
    }

    public TextSearch setLanguage(String lang) {
        params.put(Params.Language, lang);
        return this;
    }

    public TextSearch setRadius(int radius) {
        params.put(Params.Radius, radius);
        return this;
    }

    @Override
    public void sendRequest(PlacesCallback callback) {
        PlacesClient.sendRequest(Request.TextSearch, params, callback);
    }
}
