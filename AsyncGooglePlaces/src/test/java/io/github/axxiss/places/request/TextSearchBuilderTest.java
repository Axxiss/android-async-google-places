package io.github.axxiss.places.request;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by alexis on 25/10/13.
 */
@RunWith(JUnit4.class)
public class TextSearchBuilderTest {

    TextSearchBuilder builder;

    final String query = "this is a query";

    final double lat = 10.121212;
    final double lng = -2.221122;

    final int radius = 10000;

    @Before
    public void setUp(){
        builder = new TextSearchBuilder(query, lat, lng, radius);
    }


    @Test
    public void mandatoryParams(){

    }

    @Test
    public void language(){

    }
}
