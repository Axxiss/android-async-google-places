package io.github.axxiss.places.api;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Alexis Mas <alexis @ holla.com>
 */

public class PlacesParamsTest {
    private static final String TAG = "PlacesParamsTest";

    @Test
    public void testSetLocation() {
        final double lat = 1234.44;
        final double lng = 9876.33;

        PlaceParams params = new PlaceParams();
        params.setLocation(lat, lng);

        Assert.assertTrue(params.toString().contains("location=" + lat + "," + lng));
    }
}
