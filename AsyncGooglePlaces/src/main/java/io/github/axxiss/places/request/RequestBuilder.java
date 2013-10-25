package io.github.axxiss.places.request;

/**
 * @author Axxiss
 */
public abstract class RequestBuilder {

    protected PlaceParams params = new PlaceParams();

    protected String buildLocation(double lat, double lng) {
        return String.format("%s,%s", String.valueOf(lat), String.valueOf(lng));
    }
}
