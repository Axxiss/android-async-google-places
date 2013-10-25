package io.github.axxiss.places.request;

import java.util.List;

import io.github.axxiss.places.enums.Params;
import io.github.axxiss.places.enums.PlaceType;

/**
 * Build the request for a localized search request. The {@link io.github.axxiss.places.Response}
 * will contain an array of {@link io.github.axxiss .AsyncGooglePlaces.model.Place} as result.
 */
public class TextSearchBuilder extends RequestBuilder {

    public TextSearchBuilder(final String query, final double lat, final double lng, int radius) {
        params.put(Params.Query, query);
        params.put(Params.Location, buildLocation(lat, lng));
        params.put(Params.Radius, radius);
    }

    public TextSearchBuilder keyword(String keyword) {
        params.put(Params.Keyword, keyword);
        return this;
    }

    public TextSearchBuilder language(String lang) {
        params.put(Params.Language, lang);
        return this;
    }

    public TextSearchBuilder radius(int radius) {
        params.put(Params.Radius, radius);
        return this;
    }

    public TextSearchBuilder minPrice(double price) {
        params.put(Params.MinPrice, price);
        return this;
    }

    public TextSearchBuilder maxPrice(double price) {
        params.put(Params.MaxPrice, price);
        return this;
    }

    public TextSearchBuilder openNow(boolean open) {
        params.put(Params.OpenNow, open);
        return this;
    }

    public TextSearchBuilder type(List<PlaceType> types) {
        params.put(Params.Types, types);
        return this;
    }

    public TextSearchBuilder zagatSelected() {
        params.put(Params.ZagatSelected);
        return this;
    }
}
