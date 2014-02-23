package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Provides a rating of a single attribute of a establishment.
 *
 * @author Axxiss
 */
public class AspectRating implements Parcelable {
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

    public AspectRating() {

    }

    protected AspectRating(Parcel in) {
        type = in.readString();
        rating = in.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(type);
        dest.writeInt(rating);
    }

    public static final Parcelable.Creator<AspectRating> CREATOR = new Parcelable.Creator<AspectRating>() {
        public AspectRating createFromParcel(Parcel in) {
            return new AspectRating(in);
        }

        public AspectRating[] newArray(int size) {
            return new AspectRating[size];
        }
    };
}
