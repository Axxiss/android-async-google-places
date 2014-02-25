package io.github.axxiss.places.request;

import io.github.axxiss.places.enums.Params;
import io.github.axxiss.places.enums.RankBy;
import io.github.axxiss.places.enums.Request;

/**
 * Created by alexis on 25/10/13.
 */
public class NearbySearch extends BaseSearch {
    /**
     * A Nearby Search lets you search for Places within a specified area. You can refine your
     * search request by supplying keywords or specifying the type of Place you are searching for.
     *
     * @param lat
     * @param lng
     * @param radius
     * @return request params.
     */
    public NearbySearch(final double lat, final double lng, int radius) {
        super(Request.NearbySearch);
        params.put(Params.Location, PlaceParams.buildLocation(lat, lng));
        params.put(Params.Radius, radius);
    }

    public NearbySearch(final double lat, final double lng) {
        super(Request.NearbySearch);
        params.put(Params.Location, PlaceParams.buildLocation(lat, lng));
        params.put(Params.RankBy, RankBy.DISTANCE.getvalue());
    }

    public NearbySearch setKeyword(String value) {
        params.put(Params.Keyword, value);
        return this;
    }

    public NearbySearch setLanguage(String value) {
        params.put(Params.Language, value);
        return this;
    }

    public NearbySearch setName(String value) {
        params.put(Params.Name, value);
        return this;
    }

    public NearbySearch setRankBy(RankBy value) {
        params.put(Params.RankBy, value.getvalue());
        return this;
    }

    public NearbySearch setPageToken(String value) {
        params.put(Params.PageToken, value);
        return this;
    }

    public NearbySearch setRadius(int radius) {
        params.put(Params.Radius, radius);
        return this;
    }
}
