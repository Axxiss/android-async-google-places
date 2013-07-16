package io.github.axxiss.AsyncGooglePlaces.model;

/**
 * @author Axxiss
 */
public class PlaceOverview {
    public Event[] events;

    private String formatted_address;

    private String icon;

    private String id;

    private String name;

    private double rating;

    private String reference;

    private String[] type;

    private Location geometry;

    public Event[] getEvents() {
        return events;
    }

    public String getFormattedAddress() {
        return formatted_address;
    }

    public String getIcon() {
        return icon;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getReference() {
        return reference;
    }

    public String[] getType() {
        return type;
    }

    public Location getGeometry() {
        return geometry;
    }
}
