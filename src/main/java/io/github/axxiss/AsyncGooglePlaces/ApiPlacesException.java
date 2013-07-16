package io.github.axxiss.AsyncGooglePlaces;

/**
 * @author Axxiss
 */
public class ApiPlacesException extends Exception {
    private static final String TAG = "ApiPlacesException";

    public ApiPlacesException() {
        super("Api Exception");
    }

    public ApiPlacesException(String message) {
        super(message);
    }
}
