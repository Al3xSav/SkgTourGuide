package com.example.android.skgtourguide;

public class Location {

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

}
