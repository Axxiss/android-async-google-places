package io.github.axxiss.places.enums;

/**
 * Available request's params.
 *
 * @author Axxiss
 */
public enum Params {

    KEY("key"),
    KEYWORD("keyword"),
    REFERENCE("reference"),
    SENSOR("sensor"),
    QUERY("query"),
    LOCATION("location"),
    RADIUS("radius"),
    TYPES("types"),
    RANK_BY("rankby"),
    NAME("name"),
    MIN_PRICE("minprice"),
    MAX_PRICE("maxprice"),
    OPEN_NOW("opennow"),
    ZAGAT_SELECTED("zagatselected"),
    PAGE_TOKEN("pagetoken"),
    LANGUAGE("language"),
    PAGE("pagetoken"),
    EXTENSIONS("extensions"), PHOTO_REFERENCE("photoreference");

    private String mValue;

    Params(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }

}
