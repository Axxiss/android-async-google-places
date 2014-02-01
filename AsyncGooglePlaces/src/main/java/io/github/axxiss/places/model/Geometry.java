package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alexis on 2/1/14.
 */
public class Geometry implements Parcelable {
    Location location;

    public Location getLocation() {
        return location;
    }


    private Geometry(Parcel in) {
        location = (Location) in.readValue(Location.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(location);
    }

    public static final Parcelable.Creator<Geometry> CREATOR = new Parcelable.Creator<Geometry>() {
        public Geometry createFromParcel(Parcel in) {
            return new Geometry(in);
        }

        public Geometry[] newArray(int size) {
            return new Geometry[size];
        }
    };
}
