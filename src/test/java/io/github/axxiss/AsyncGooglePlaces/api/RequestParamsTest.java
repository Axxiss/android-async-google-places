package io.github.axxiss.AsyncGooglePlaces.api;

import io.github.axxiss.AsyncGooglePlaces.PlacesSettings;
import io.github.axxiss.AsyncGooglePlaces.api.enums.RankBy;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */

@RunWith(RobolectricTestRunner.class)
public class RequestParamsTest {
    private static final String TAG = "PlacesParamsTest";

    private static String API_KEY = "1983749b8v47102v48b169v4";

    private void assertParam(RequestParams params, String name, String value) {
        String pair = String.format("%s=%s", name, value);
        assertTrue(params.getParams().toString().contains(pair));
    }

    private void assertParam(RequestParams params, String name, boolean value) {
        assertParam(params, name, String.valueOf(value));
    }

    @Before
    public void setUp() {
        PlacesSettings.getInstance().setApiKey(API_KEY);
    }

    @Test
    public void testRequestParams() {
        RequestParams params = new RequestParams(true);

        assertParam(params, "sensor", true);
        assertParam(params, "key", API_KEY);

        params = new RequestParams(false);
        assertParam(params, "sensor", false);
        assertParam(params, "key", API_KEY);
    }

    @Test
    public void testSetLocation() {
        final double lat = 1234.44;
        final double lng = 9876.33;

        RequestParams params = new RequestParams(true);
        params.setLocation(lat, lng);

        assertParam(params, "location", lat + "," + lng);
    }

    @Test
    public void testSetRankBy() {
        RequestParams params = new RequestParams();
        params.setRankBy(RankBy.DISTANCE);

        assertParam(params, "rankby", "distance");

        params = new RequestParams();
        params.setRankBy(RankBy.PROMINENCE);

        assertParam(params, "rankby", "prominence");
    }

    @Test
    public void testSetTypes() {
        fail();
    }

    @Test
    public void testSetLanguage() {
        fail();
    }

    @Test
    public void testSetKeyword() {
        RequestParams params = new RequestParams();
        String keyword = "blablabla";
        params.setKeyword(keyword);
        assertParam(params, "keyword", keyword);
    }
}
