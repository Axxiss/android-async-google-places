package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * A period represents a period of time when a {@link io.github.axxiss.places.model.Place} is open
 * or closed.
 *
 * @author Axxiss
 */
public class Period implements Parcelable {
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

    protected Period(Parcel in) {
        open = (PeriodData) in.readValue(PeriodData.class.getClassLoader());
        close = (PeriodData) in.readValue(PeriodData.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(open);
        dest.writeValue(close);
    }

    public static final Parcelable.Creator<Period> CREATOR = new Parcelable.Creator<Period>() {
        public Period createFromParcel(Parcel in) {
            return new Period(in);
        }

        public Period[] newArray(int size) {
            return new Period[size];
        }
    };
}
