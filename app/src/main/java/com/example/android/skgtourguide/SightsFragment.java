package com.example.android.skgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {
    }

    public static SightsFragment newInstance() {
        SightsFragment fragment = new SightsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Location> locations = new ArrayList<Location>(); // ArrayList of sights

        // Add White Tower to the array list
        locations.add(new Location(
                getString(R.string.white_tower),
                getString(R.string.white_tower_address),
                getString(R.string.white_tower_info),
                R.drawable.ic_white_tower,
                getString(R.string.white_tower_website),
                getString(R.string.white_tower_coord),
                getString(R.string.white_tower_phone),
                getString(R.string.white_tower_working_hours)));

        // Add Byzantine Walls to the array list
        locations.add(new Location(
                getString(R.string.byzantine_walls),
                getString(R.string.byzantine_walls_address),
                getString(R.string.byzantine_walls_info),
                R.drawable.ic_byzantine_castles,
                getString(R.string.byzantine_walls_website),
                getString(R.string.byzantine_walls_coord),
                getString(R.string.byzantine_walls_phone),
                getString(R.string.byzantine_walls_hours)));

        // Add Arch of Galerius to the array list
        locations.add(new Location(
                getString(R.string.arch_galerius),
                getString(R.string.arch_galerius_address),
                getString(R.string.arch_galerius_info),
                R.drawable.ic_arch_galerius,
                getString(R.string.arch_galerius_website),
                getString(R.string.arch_galerius_coord),
                getString(R.string.arch_galerius_phone),
                getString(R.string.arch_galerius_hours)));

        // Add Rotonda to the array list
        locations.add(new Location(
                getString(R.string.rotonda),
                getString(R.string.rotonda_address),
                getString(R.string.rotonda_info),
                R.drawable.ic_rotonda,
                getString(R.string.rotonda_website),
                getString(R.string.rotonda_coord),
                getString(R.string.rotonda_phone),
                getString(R.string.rotonda_hours)));

        // Add Agios Dimitrios to the array list
        locations.add(new Location(
                getString(R.string.agios_dimitrios),
                getString(R.string.agios_dimitrios_address),
                getString(R.string.agios_dimitrios_info),
                R.drawable.ic_agios_dimitrios,
                getString(R.string.agios_dimitrios_website),
                getString(R.string.agios_dimitrios_coord),
                getString(R.string.agios_dimitrios_phone),
                getString(R.string.agios_dimitrios_hours)));

        // Set the adapter for the location
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
