package io.github.axxiss.AsyncGooglePlaces.api;

import io.github.axxiss.AsyncGooglePlaces.model.PlaceOverview;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.List;
import java.util.Map;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public interface GooglePlaces {
    @GET("nearbysearch/output{?parameters}")
    List<PlaceOverview> nearbySearch(@Query("parameters") Map<String, String> parameters);
}
