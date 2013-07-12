package io.github.axxiss.AsyncGooglePlaces.model;

/**
 * @author Axxiss
 */
public enum Params {

    KEY("KEY"),
    REFERENCE("reference"),
    SENSOR("sensor"),
    QUERY("query");

    private String mValue;

    Params(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

}
