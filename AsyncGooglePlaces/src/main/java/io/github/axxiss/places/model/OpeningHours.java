package io.github.axxiss.places.model;

/**
 * The opening hours of a a {@link io.github.axxiss.places.model.Place}
 *
 * @author Axxiss
 */
public class OpeningHours {
    private boolean open_now;
    private Period[] periods;

    /**
     * Indicates if the Place is open at the current time.
     *
     * @return
     */
    public boolean isOpenNow() {
        return open_now;
    }

    /**
     * Returns an array of opening periods covering seven days, starting from Sunday,
     * in chronological order.
     *
     * @return the periods.
     */
    public Period[] getPeriods() {
        return periods;
    }
}
