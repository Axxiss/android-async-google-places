package io.github.axxiss.places.enums;

/**
 * Created by alexis on 25/10/13.
 */
public enum Request {
    NearbySearch,
    TextSearch,
    RadarSearch,
    Autocomplete,
    QueryAutocomplete,
    Photo;

    public String getValue() {
        return this.name().toLowerCase();
    }
}
