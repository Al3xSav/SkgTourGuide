package com.example.android.skgtourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private Context context = getContext();

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        // Get the object located at this position in the list
        Location currentLocation = getItem(position);

        // Get it's properties
        String name = currentLocation.getLocationName();
        String address = currentLocation.getLocationAddress();
        String description = currentLocation.getLocationDesc();
        int imageID = currentLocation.getLocationImageID();
        String url = currentLocation.getLocationURL();
        String coordinates = currentLocation.getLocationCoordinates();
        String number = currentLocation.getLocationPhoneNumber();
        String hours = currentLocation.getLocationWorkingHours();

        // Get ImageView and set the name of the object
        final ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_list_item);
        imageView.setImageResource(imageID);

        // Get TextView and set the name of the Object
        TextView textViewName = (TextView) listItemView.findViewById(R.id.list_item_name);
        textViewName.setText(name);

        /*TextView textViewWebsite = (TextView) listItemView.findViewById(R.id.textView_website);
        textViewWebsite.setText(url);*/

        // Get TextView and set the name of the Object
        TextView textViewAddress = (TextView) listItemView.findViewById(R.id.list_item_address);
        textViewAddress.setText(address);

        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent intent = new Intent(context, LocationActivity.class);

        // Put the properties of the object to the intent
        intent.putExtra(context.getString(R.string.name_object), name);
        intent.putExtra(context.getString(R.string.address_object), address);
        intent.putExtra(context.getString(R.string.desc_object), description);
        intent.putExtra(context.getString(R.string.image_object), imageID);
        intent.putExtra(context.getString(R.string.website_object), url);
        intent.putExtra(context.getString(R.string.coordinates_object), coordinates);
        intent.putExtra(context.getString(R.string.phone_object), number);
        intent.putExtra(context.getString(R.string.working_hours_object), hours);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(intent);
            }
        });
        return listItemView;
    }
}
