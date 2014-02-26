package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * The Photo service gives you access to the millions of photos stored in the Places and Google+
 * Local database. When you search for Places using either a Place Search or Place Details request,
 * photo references will be returned for relevant photographic content. The Photo service lets you
 * access the referenced photos, and resize the image to the optimal size for your application.
 *
 * @author Axxiss
 */
public class Photo implements Parcelable {

    private String photo_reference;

    private int width;

    private int height;

    private String[] html_attributions;

    /**
     * A string used to identify the photo when you perform a Photo request.
     *
     * @return
     */
    public String getPhoto_reference() {
        return photo_reference;
    }

    /**
     * The maximum width of the image.
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * The maximum height of the image.
     *
     * @return the height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Contains any required attributions. This field will always be present, but may be empty.
     *
     * @return
     */
    public String[] getHtml_attributions() {
        return html_attributions;
    }

    protected Photo(Parcel in) {
        photo_reference = in.readString();
        width = in.readInt();
        height = in.readInt();
        html_attributions = new String[in.readInt()];
        in.readStringArray(html_attributions);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photo_reference);
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeInt(html_attributions.length);
        dest.writeStringArray(html_attributions);
    }

    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() {
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        public Photo[] newArray(int size) {
            return new Photo[size];
        }
    };
}
