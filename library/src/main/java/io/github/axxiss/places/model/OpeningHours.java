package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * The opening hours of a a {@link io.github.axxiss.places.model.Place}
 *
 * @author Axxiss
 */
public class OpeningHours implements Parcelable {
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
     * Returns an array of opening periods covering seven days, starting from Sunday, in
     * chronological order.
     *
     * @return the periods.
     */
    public Period[] getPeriods() {
        return periods;
    }

    protected OpeningHours(Parcel in) {
        open_now = in.readByte() != 0x00;
        periods = (Period[]) in.readParcelableArray(Period.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (open_now ? 0x01 : 0x00));
        dest.writeParcelableArray(periods, 0);
    }

    public static final Parcelable.Creator<OpeningHours> CREATOR = new Parcelable.Creator<OpeningHours>() {
        public OpeningHours createFromParcel(Parcel in) {
            return new OpeningHours(in);
        }

        public OpeningHours[] newArray(int size) {
            return new OpeningHours[size];
        }
    };
}
