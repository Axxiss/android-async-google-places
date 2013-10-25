package io.github.axxiss.places;

import io.github.axxiss.places.callback.PlacesCallback;

/**
 * Created by alexis on 25/10/13.
 */
public interface IPlaceClient {

    public void sendRequest(final PlacesCallback callback);

}
