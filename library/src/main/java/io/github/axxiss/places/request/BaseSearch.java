package io.github.axxiss.places.request;

import java.util.List;

import io.github.axxiss.places.callback.PlacesCallback;
import io.github.axxiss.places.enums.Params;
import io.github.axxiss.places.enums.PlaceType;
import io.github.axxiss.places.enums.Request;

/**
 * Base class for search request.
 *
 * @author Axxiss
 */
public abstract class BaseSearch {

    /**
     * Places request parameters.
     */
    protected PlaceParams params = new PlaceParams();

    /**
     * The request type.
     */
    private Request mRequest;

    protected BaseSearch(Request request) {
        mRequest = request;
    }


    public BaseSearch setMinPrice(double price) {
        params.put(Params.MinPrice, price);
        return this;
    }

    public BaseSearch setMaxPrice(double price) {
        params.put(Params.MaxPrice, price);
        return this;
    }

    public BaseSearch setLocation(double lat, double lng) {
        params.put(Params.Location, PlaceParams.buildLocation(lat, lng));
        return this;
    }

    public BaseSearch setZagatSelected() {
        params.put(Params.ZagatSelected);
        return this;
    }

    public BaseSearch setSetOpenNow(boolean open) {
        params.put(Params.OpenNow, open);
        return this;
    }

    public BaseSearch setType(List<PlaceType> types) {
        params.put(Params.Types, types);
        return this;
    }

    public void sendRequest(final PlacesCallback callback) {
        PlacesClient.sendRequest(mRequest, params, callback);
    }

}
