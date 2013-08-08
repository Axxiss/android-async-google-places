package io.github.axxiss.AsyncGooglePlaces.api;

import io.github.axxiss.AsyncGooglePlaces.model.PlaceOverview;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.Map;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public interface GooglePlaces {
    @GET("nearbysearch/output{?parameters}")
    void nearbySearch(@Query("parameters") Map<String, String> parameters, Callback<PlaceOverview[]> cb);
}
