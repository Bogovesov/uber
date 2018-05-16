package com.uber.main.service.passenger.profile;

public class Photo {
    private String photoLocation;

    public Photo(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }
}
