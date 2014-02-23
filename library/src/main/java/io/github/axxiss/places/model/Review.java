package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Axxiss
 */
public class Review implements Parcelable {
    private AspectRating[] aspects;
    private String author_name;
    private String author_url;
    private String text;
    private int time;

    /**
     * Returns a collection of AspectRating objects, each of which provides a rating of a single
     * attribute of the establishment. The first object in the collection is considered the primary
     * aspect.
     *
     * @return
     */
    public AspectRating[] getAspects() {
        return aspects;
    }

    /**
     * The name of the user who submitted the review. Anonymous reviews are attributed to "A Google
     * user".
     *
     * @return
     */
    public String getAuthorName() {
        return author_name;
    }

    /**
     * The URL to the users Google+ profile, if available.
     *
     * @return the url.
     */
    public String getAuthorUrl() {
        return author_url;
    }

    /**
     * Contains the user's review. When reviewing a location with Google Places, text reviews are
     * considered optional; therefore, this field may by empty.
     *
     * @return the review.
     */
    public String getText() {
        return text;
    }

    /**
     * The time that the review was submitted, measured in the number of seconds since since
     * midnight, January 1, 1970 UTC.
     *
     * @return
     */
    public int getTime() {
        return time;
    }

    protected Review(Parcel in) {
        author_name = in.readString();
        author_url = in.readString();
        text = in.readString();
        time = in.readInt();
        aspects = (AspectRating[]) in.readParcelableArray(AspectRating.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(author_name);
        dest.writeString(author_url);
        dest.writeString(text);
        dest.writeInt(time);
        dest.writeParcelableArray(aspects, 0);
    }

    public static final Parcelable.Creator<Review> CREATOR = new Parcelable.Creator<Review>() {
        public Review createFromParcel(Parcel in) {
            return new Review(in);
        }

        public Review[] newArray(int size) {
            return new Review[size];
        }
    };
}
