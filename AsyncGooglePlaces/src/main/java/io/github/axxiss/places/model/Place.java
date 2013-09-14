package io.github.axxiss.places.model;

/**
 * @author Axxiss
 */
public class Place {
    public Event[] events;

    private String formatted_address;

    private String icon;

    private String id;

    private String name;

    private double rating;

    private String reference;

    private String[] type;

    private Geometry geometry;

    private String vicinity;

    private OpeningHours opening_hours;

    private Photo[] photos;

    private int price_level;

    /**
     * Returns a feature name of a nearby location. Often this feature refers to a street or
     * neighborhood within the given results. The vicinity property is only returned for a
     * Nearby Search.
     *
     * @return the vicinity.
     */
    public String getVicinity() {
        return vicinity;
    }


    /**
     * The price level of the Place, on a scale of 0 to 4. The exact amount indicated by a specific
     * value will vary from region to region. Price levels are interpreted as follows:
     *
     * @return
     */
    public int getPrice_level() {
        return price_level;
    }

    /**
     * Returns an array of {@link io.github.axxiss.places.model.Photo}s, each containing a reference
     * to an image. A Place Search will return at most one photo object. Performing a Place Details
     * request on the Place may return up to ten photos. More information about Place Photos and how
     * you can use the images in your application can be found in the Place Photos documentation.
     *
     * @return the photos.
     */
    public Photo[] getPhotos() {
        return photos;
    }

    /**
     * Returns the time table of the place.
     *
     * @return the opening hours.
     */
    public OpeningHours getOpening_hours() {
        return opening_hours;
    }

    /**
     * Array or one or more {@link io.github.axxiss.places.model.Event} elements provide information
     * about current events happening at this Place. Up to three events are returned for each place,
     * ordered by start time. For information about events, please read Events in the Places API.
     *
     * @return place's events.
     */
    public Event[] getEvents() {
        return events;
    }

    /**
     * Returns a string containing the human-readable address of this place. Often this address is
     * equivalent to the "postal address". The formatted_address property is only returned for
     * a Text Search.
     *
     * @return
     */
    public String getFormattedAddress() {
        return formatted_address;
    }

    /**
     * Returns the URL of a recommended icon which may be displayed to the user when indicating
     * this result.
     *
     * @return the url.
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Returns a unique stable identifier denoting this place. This identifier may not be used to
     * retrieve information about this place, but is guaranteed to be valid across sessions. It can
     * be used to consolidate data about this Place, and to verify the identity of a Place across
     * separate searches.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the human-readable name. For establishment results, this is usually the business name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the Place's rating, from 1.0 to 5.0, based on user reviews.
     *
     * @return
     */
    public double getRating() {
        return rating;
    }

    /**
     * Returns a unique token that you can use to retrieve additional information about this place
     * in a Place Details request. You can store this token and use it at any time in future to
     * refresh cached data about this Place, but the same token is not guaranteed to be returned
     * for any given Place across different searches.
     *
     * @return the reference token.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Returns an array of feature types describing the given result.
     *
     * @return
     * @see io.github.axxiss.places.api.enums.PlaceType
     */
    public String[] getType() {
        return type;
    }

    /**
     * Returns {@link io.github.axxiss.places.model.Place.Geometry} information about the result,
     * generally including the location (geocode) of the Place and (optionally) the viewport
     * identifying its general area of coverage.
     *
     * @return the geometry
     */
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
