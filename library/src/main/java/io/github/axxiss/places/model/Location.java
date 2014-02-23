package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Axxiss
 */
public class Location implements Parcelable {
    private double lat;

    private double lng;

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public Location() {
    }

    protected Location(Parcel in) {
        lat = in.readDouble();
        lng = in.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(lat);
        dest.writeDouble(lng);
    }

    public static final Parcelable.Creator<Location> CREATOR = new Parcelable.Creator<Location>() {
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        public Location[] newArray(int size) {
            return new Location[size];
        }
    };
}
