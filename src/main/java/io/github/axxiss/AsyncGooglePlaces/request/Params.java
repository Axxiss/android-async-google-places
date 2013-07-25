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
    RADIUS("radius"),
    TYPES("types"),
    RANK_BY("rankby");

    private String mValue;

    Params(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

}
