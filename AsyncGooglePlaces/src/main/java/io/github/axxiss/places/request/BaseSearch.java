package io.github.axxiss.places.request;

import java.util.List;

import io.github.axxiss.places.enums.Params;
import io.github.axxiss.places.enums.PlaceType;

/**
 * @author Axxiss
 */
public abstract class BaseSearch {

    protected PlaceParams params = new PlaceParams();


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

}
