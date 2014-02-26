package io.github.axxis.places.sample;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.github.axxiss.places.model.Place;

/**
 * Created by alexis on 2/23/14.
 */
public class PlaceActivity extends ListActivity {

    private static final String KEY_PLACES = "KEY_PLACES";

    public static void newInstance(Context source, ArrayList<Place> places) {
        Intent intent = new Intent(source, PlaceActivity.class);
        intent.putParcelableArrayListExtra(KEY_PLACES, places);
        source.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();

        List<Place> places = extras.getParcelableArrayList(KEY_PLACES);

        if (places == null) {
            Toast.makeText(this, "I have no places...", Toast.LENGTH_LONG).show();
            return;
        }

        Place[] items = new Place[places.size()];
        places.toArray(items);
        setListAdapter(new PlaceAdapter(this, items));

    }


    static class PlaceAdapter extends ArrayAdapter<Place> implements ListAdapter {
        public PlaceAdapter(Context context, Place[] places) {
            super(context, android.R.layout.simple_list_item_1, places);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView view = (TextView) super.getView(position, convertView, parent);
            view.setText(getItem(position).getName());
            return view;
        }
    }
}
