package com.uber.main.service.passenger.profile;

public class Profile {
    private Name lastName;
    private Name firstName;
    private Photo photo;
    private Email email;
    private PhoneNumber phoneNumber;
    private String description;
    private Gender gender;

    public Name getLastName() {
        return lastName;
    }

    public Name getFirstName() {
        return firstName;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Email getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public Gender getGender() {
        return gender;
    }

    public void setLastName(Name lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(Name firstName) {
        this.firstName = firstName;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
