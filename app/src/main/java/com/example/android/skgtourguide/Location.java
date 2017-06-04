package com.example.android.skgtourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class Location implements Parcelable {

    private String locationName; // name of the location
    private String locationAddress; // address of the location
    private String locationDesc; // description of the location
    private int locationImageID; // image of the location
    private String locationURL; // website for the location
    private String locationCoordinates; // coordinates of the location
    private String locationPhoneNumber; // phone number of the location
    private String locationWorkingHours; // working hours of the location

    // constructor
    public Location(String name, String address, String description, int imageID, String url,
                    String coordinates, String phoneNumber, String workingHours) {
        locationName = name;
        locationAddress = address;
        locationDesc = description;
        locationImageID = imageID;
        locationURL = url;
        locationCoordinates = coordinates;
        locationPhoneNumber = phoneNumber;
        locationWorkingHours = workingHours;
    }

    // Get the details of the location
    public String getLocationName() {
        return locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public int getLocationImageID() { return locationImageID;}

    public String getLocationURL() {
        return locationURL;
    }

    public String getLocationCoordinates() {
        return locationCoordinates;
    }

    public String getLocationPhoneNumber() {
        return locationPhoneNumber;
    }

    public String getLocationWorkingHours() {
        return locationWorkingHours;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.locationAddress);
        dest.writeString(this.locationDesc);
        dest.writeInt(this.locationImageID);
        dest.writeString(this.locationURL);
        dest.writeString(this.locationCoordinates);
        dest.writeString(this.locationPhoneNumber);
        dest.writeString(this.locationWorkingHours);
        dest.writeString(this.locationName);
    }

    protected Location(Parcel in) {
        this.locationAddress = in.readString();
        this.locationDesc = in.readString();
        this.locationImageID = in.readInt();
        this.locationURL = in.readString();
        this.locationCoordinates = in.readString();
        this.locationPhoneNumber = in.readString();
        this.locationWorkingHours = in.readString();
        this.locationName = in.readString();
    }

    public static final Parcelable.Creator<Location> CREATOR = new Parcelable.Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel source) {
            return new Location(source);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };
}
