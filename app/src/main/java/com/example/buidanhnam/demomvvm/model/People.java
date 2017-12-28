package com.example.buidanhnam.demomvvm.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by le.quang.hoa on 12/5/16.
 */

public class People implements Serializable  {
    public People(String gender, String name, Picture picture) {
        this.gender = gender;
        this.fullName = name;
        this.picture = picture;
    }

    @SerializedName("gender")
    public String gender;

    @SerializedName("name")
    public Name name;

    @SerializedName("location")
    public Location location;

    @SerializedName("email")
    public String email;

    @SerializedName("login")
    public Login username;

    @SerializedName("phone")
    public String phone;

    @SerializedName("cell")
    public String cell;

    @SerializedName("picture")
    public Picture picture;

    public String fullName;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getUsername() {
        return username;
    }

    public void setUsername(Login username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean hasEmail() {
        return email != null && !email.isEmpty();
    }

}
