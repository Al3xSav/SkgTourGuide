package com.example.android.skgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    public static MuseumsFragment newInstance() {
        MuseumsFragment fragment = new MuseumsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Location> locations = new ArrayList<>();// ArrayList of sights

        // Add info of each location to the array list
        locations.add(new Location(
                getString(R.string.archaeological_museum),
                getString(R.string.archaeological_address),
                getString(R.string.archaeological_museum_info),
                R.drawable.ic_archaeological_museum,
                getString(R.string.archaeological_website),
                getString(R.string.archaeological_coord),
                getString(R.string.archaeological_phone),
                getString(R.string.archaeological_working_hours)));

        // Set the adapter for the location
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
