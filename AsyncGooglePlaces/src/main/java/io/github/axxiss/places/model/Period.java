package io.github.axxiss.places.model;

/**
 * A period represents a period of time when a {@link io.github.axxiss.places.model.Place} is open
 * or closed.
 *
 * @author Axxiss
 */
public class Period {
    private PeriodData open;
    private PeriodData close;

    /**
     * Returns a pair of day and time objects describing when the Place opens:
     *
     * @return
     */
    public PeriodData getOpen() {
        return open;
    }

    /**
     * Returns a pair of day and time objects describing when the Place closes:
     *
     * @return
     */
    public PeriodData getClose() {
        return close;
    }
}
