package io.github.axxiss.places.model;

/**
 * Provides a rating of a single attribute of a establishment.
 *
 * @author Axxiss
 */
public class AspectRating {
    private String type;

    private int rating;

    /**
     * The name of the aspect that is being rated. eg. atmosphere, service, food, overall, etc.
     *
     * @return the type.
     */
    public String getType() {
        return type;
    }

    /**
     * The user's rating for this particular aspect, from 0 to 3.
     *
     * @return the rating.
     */
    public int getRating() {
        return rating;
    }
}
