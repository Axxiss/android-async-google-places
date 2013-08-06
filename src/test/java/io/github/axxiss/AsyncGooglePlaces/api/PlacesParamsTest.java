package io.github.axxiss.AsyncGooglePlaces.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */

@RunWith(RobolectricTestRunner.class)
public class PlacesParamsTest {
    private static final String TAG = "PlacesParamsTest";

    @Test
    public void testSetLocation() {
        final double lat = 1234.44;
        final double lng = 9876.33;

        PlacesParams params = new PlacesParams();
        params.setLocation(lat, lng);

        Assert.assertTrue(params.toString().contains("location=" + lat + "," + lng));
    }
}
