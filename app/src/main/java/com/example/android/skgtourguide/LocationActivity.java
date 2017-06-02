package com.example.android.skgtourguide;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        // Get information of the location object from the intent

        Bundle bundle = getIntent().getExtras();
        String locationName = bundle.getString(getString(R.string.name_object));
        String locationAddress = bundle.getString(getString(R.string.address_object));
        String locationDesc = bundle.getString(getString(R.string.desc_object));
        int locationImage = bundle.getInt(getString(R.string.image_object));
        final String locationURL = bundle.getString(getString(R.string.website_object));
        final String locationCoordinates = bundle.getString(getString(R.string.coordinates_object));
        String locationPhoneNumber = bundle.getString(getString(R.string.phone_object));
        String locationWorkingHours = bundle.getString(getString(R.string.working_hours_object));


        // Set the name of the place as the title of the screen
        this.setTitle(locationName);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        imageView.setImageResource(locationImage);

        TextView textViewName = (TextView) findViewById(R.id.textView_name);
        textViewName.setText(locationName);

        TextView textViewAddress = (TextView) findViewById(R.id.textView_address);
        textViewAddress.setPaintFlags(textViewAddress.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textViewAddress.setText(locationAddress);

        TextView textViewDesc = (TextView) findViewById(R.id.textView_info);
        textViewDesc.setText(locationDesc);

        TextView textViewNumber = (TextView) findViewById(R.id.textView_phone);
        textViewNumber.setText(locationPhoneNumber);

        TextView textViewHours = (TextView) findViewById(R.id.textView_hours);
        textViewHours.setText(locationWorkingHours);

        TextView textViewURL = (TextView) findViewById(R.id.textView_website);
        textViewURL.setPaintFlags(textViewURL.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textViewURL.setText(locationURL);
        textViewURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse(locationURL);
                Intent uriIntent = new Intent(Intent.ACTION_VIEW, uri);
                if (uriIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(uriIntent);
                }
            }
        });

        textViewAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri geoLocation = Uri.parse("geo:" + locationCoordinates + "?z=18");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
