package io.github.axxiss.places.enums;

/**
 * Available request's params.
 *
 * @author Axxiss
 */
public enum Params {

    Key,
    Keyword,
    Reference,
    Sensor,
    Query,
    Location,
    Radius,
    Types,
    RankBy,
    Name,
    MinPrice,
    MaxPrice,
    OpenNow,
    ZagatSelected,
    PageToken,
    PĥotoReference,
    Language,
    Page,
    Extensions,
    MaxHeight,
    MaxWidth;

    public String getValue() {
        return this.name().toLowerCase();
    }

}
