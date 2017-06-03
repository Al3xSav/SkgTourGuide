package com.example.android.skgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    public static RestaurantsFragment newInstance() {
        RestaurantsFragment fragment = new RestaurantsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Location> locations = new ArrayList<>(); // ArrayList of sights

        // Add Molyvos to the array list
        locations.add(new Location(
                getString(R.string.molyvos),
                getString(R.string.molyvos_address),
                getString(R.string.molyvos_info),
                R.drawable.ic_molyvos_2,
                getString(R.string.molyvos_website),
                getString(R.string.molyvos_coord),
                getString(R.string.molyvos_phone),
                getString(R.string.molyvos_working_hours)));

        // Add Elia Lemoni to the array list
        locations.add(new Location(
                getString(R.string.elia_lemoni),
                getString(R.string.elia_lemoni_address),
                getString(R.string.elia_lemoni_info),
                R.drawable.ic_elia_lemoni,
                getString(R.string.elia_lemoni_website),
                getString(R.string.elia_lemoni_coord),
                getString(R.string.elia_lemoni_phone),
                getString(R.string.elia_lemoni_working_hours)));

        // Add Habanera to the array list
        locations.add(new Location(
                getString(R.string.habanera),
                getString(R.string.habanera_address),
                getString(R.string.habanera_info),
                R.drawable.ic_habanera,
                getString(R.string.habanera_website),
                getString(R.string.habanera_coord),
                getString(R.string.habanera_phone),
                getString(R.string.habanera_working_hours)));

        // Set the adapter for the location
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
