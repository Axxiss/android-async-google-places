package io.github.axxis.places.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.github.axxiss.places.PlacesSettings;
import io.github.axxiss.places.Response;
import io.github.axxiss.places.callback.PlacesCallback;
import io.github.axxiss.places.request.PlaceSearch;

/**
 * Created by alexis on 2/23/14.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlacesSettings.getInstance().setApiKey("AIzaSyAqKRDhvqXCB3YUwOysjboMzTSgiOaNjOA");

    }

    public void onSearchClicked(View source) {
        int radius = 10000;
        double lat = -33.8670522;
        double lng = 151.1957362;

        PlaceSearch.nearbySearch(lat, lng, radius).sendRequest(new PlacesCallback() {
            @Override
            public void onSuccess(Response response) {
                PlaceActivity.newInstance(MainActivity.this, response.getResults());
            }

            @Override
            public void onException(Exception exception) {
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_LONG).show();
            }
        });
    }
}
