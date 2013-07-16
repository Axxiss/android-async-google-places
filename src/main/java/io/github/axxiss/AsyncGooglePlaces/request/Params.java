package io.github.axxiss.AsyncGooglePlaces.request;

/**
 * Available request's params.
 *
 * @author Axxiss
 */
public enum Params {

    KEY("key"),
    REFERENCE("reference"),
    SENSOR("sensor"),
    QUERY("query"),
    LOCATION("location"),
    RADIUS("radius");

    private String mValue;

    Params(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

}
