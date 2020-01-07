package sample;

import java.time.LocalDate;

public class AddContacts {
    private static String firstName, lastName, email, address;
    private static String phoneNumber;
    LocalDate dateOFBirth;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(LocalDate dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }
}