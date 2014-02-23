package io.github.axxiss.places.request;

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
    public static TextSearch textSearch(final String query, final double lat, final double lng, int radius) {
        return new TextSearch(query, lat, lng, radius);
    }

    public static RadarSearch radarSearch(final double lat, final double lng, int radius) {
        return new RadarSearch(lat, lng, radius);
    }

    public static NearbySearch nearbySearch(final double lat, final double lng, int radius) {
        return new NearbySearch(lat, lng, radius);
    }

    public static NearbySearch nearbySearch(final double lat, final double lng) {
        return new NearbySearch(lat, lng);
    }
}
