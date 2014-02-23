package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * The Google Places API includes support for events, which are defined as any type of public or
 * private gathering, performance, or promotion that occurs at a location listed in the Places
 * service.
 *
 * @author Axxiss
 */
public class Event implements Parcelable {

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

    public Event() {
    }

    ;

    protected Event(Parcel in) {
        event_id = in.readString();
        duration = in.readInt();
        summary = in.readString();
        url = in.readString();
        start_time = in.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(event_id);
        dest.writeInt(duration);
        dest.writeString(summary);
        dest.writeString(url);
        dest.writeLong(start_time);
    }

    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() {
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        public Event[] newArray(int size) {
            return new Event[size];
        }
    };
}
