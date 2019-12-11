package sample;

import java.util.Date;

public class AddContacts {
    Date dateOFBirth;
    private String firstName, lastName, email, address;
    private String male = "Male";
    private String female = "Female";
    private int phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(Date dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }
}