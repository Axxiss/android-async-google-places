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

    private Geometry geometry;

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

    public Geometry getGeometry() {
        return geometry;
    }

    public static class Geometry {
        Location location;

        public Location getLocation() {
            return location;
        }
    }
}
