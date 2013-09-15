package io.github.axxiss.places.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Address components used to compose a given address. For example, the address "111 8th Avenue, New
 * York, NY" contains separate address components for "111" (the street number, "8th Avenue" (the
 * route), "New York" (the city) and "NY" (the US state).
 *
 * @author Axxiss
 */
public class AddressComponent implements Parcelable {

    private String[] types;
    private String long_name;
    private String short_name;

    /**
     * Returns an array indicating the type of the address component.
     *
     * @return the types.
     */
    public String[] getTypes() {
        return types;
    }

    /**
     * The full text description or name of the address component.
     *
     * @return
     */
    public String getLongName() {
        return long_name;
    }

    /**
     * Abbreviated textual name for the address component, if available. For example, an address
     * component for the state of Alaska may have a long_name of "Alaska" and a short_name of "AK"
     * using the 2-letter postal abbreviation.
     *
     * @return the short name.
     */
    public String getShortName() {
        return short_name;
    }

    public AddressComponent() {

    }

    protected AddressComponent(Parcel in) {
        in.readStringArray(types);
        long_name = in.readString();
        short_name = in.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(types);
        dest.writeString(long_name);
        dest.writeString(short_name);
    }

    public static final Parcelable.Creator<AddressComponent> CREATOR = new Parcelable.Creator<AddressComponent>() {
        public AddressComponent createFromParcel(Parcel in) {
            return new AddressComponent(in);
        }

        public AddressComponent[] newArray(int size) {
            return new AddressComponent[size];
        }
    };
}
