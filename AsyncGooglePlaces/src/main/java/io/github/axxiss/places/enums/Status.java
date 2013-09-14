package io.github.axxiss.places.enums;

/**
 * The "status" field within the search response object contains the status of the request, and may
 * contain debugging information to help you track down why the request failed.
 * <p/>
 * The "status" field may contain the values defined in this class.
 *
 * @author Axxiss
 */
public enum Status {
    /**
     * indicates that no errors occurred; the place was successfully detected and at least one
     * result was returned.
     */
    OK("OK"),

    /**
     * Indicates a server-side error; trying again may be successful.
     */
    UNKNOWN_ERROR("UNKNOWN_ERROR"),

    /**
     * Indicates that the search was successful but returned no results. This may occur if the
     * search was passed a latlng in a remote location.
     */
    ZERO_RESULTS("ZERO_RESULTS"),

    /**
     * Indicates that you are over your quota.
     */
    OVER_QUERY_LIMIT("OVER_QUERY_LIMIT"),

    /**
     * Indicates that your request was denied, generally because of lack of a sensor parameter.
     */
    REQUEST_DENIED("REQUEST_DENIED"),

    /**
     * Generally indicates that a required query parameter (location or radius) is missing.
     */
    INVALID_REQUEST("INVALID_REQUEST"),

    /**
     * Indicates that the referenced location was not found in the Places database.
     */
    NOT_FOUND("NOT_FOUND");

    private String mValue;

    /**
     * Set the string value of the enum.
     *
     * @param value
     */
    private Status(String value) {
        mValue = value;
    }

    /**
     * Returns the string value of the enum.
     *
     * @return
     */
    public String toString() {
        return mValue;
    }

}
