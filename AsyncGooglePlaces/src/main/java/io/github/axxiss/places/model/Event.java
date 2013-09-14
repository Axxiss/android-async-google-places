package io.github.axxiss.places.model;

/**
 * The Google Places API includes support for events, which are defined as any type of public or
 * private gathering, performance, or promotion that occurs at a location listed in the
 * Places service.
 *
 * @author Axxiss
 */
public class Event {

    private String event_id;

    private int duration;

    private String summary;

    private String url;

    private long start_time;


    /**
     * The unique ID of this event.
     *
     * @return the id.
     */
    public String getEventId() {
        return event_id;
    }

    /**
     * The duration of the event in seconds.
     *
     * @return the duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * A textual description of the event. This property contains a string, the contents of which
     * are not sanitized by the server. Your application should be prepared to prevent or deal with
     * attempted exploits, if necessary.
     *
     * @return the summary.
     */
    public String getSummary() {
        return summary;
    }

    /**
     * A URL pointing to details about the event. This property will not be returned if no URL was
     * specified for the event.
     *
     * @return the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Event's start time. Expressed in Unix time.
     *
     * @return the start time.
     */
    public long getStartTime() {
        return start_time;
    }
}
