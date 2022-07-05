package com.exercises.domain.classes.selection.talent;

public class Company {
    private String name;
    private String description;
    private String lineBusiness;
    private String address;
    private String contactNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLineBusiness() {
        return lineBusiness;
    }

    public void setLineBusiness(String lineBusiness) {
        this.lineBusiness = lineBusiness;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Company(String name, String description, String lineBusiness, String address, String contactNumber) {
        this.name = name;
        this.description = description;
        this.lineBusiness = lineBusiness;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", lineBusiness='" + lineBusiness + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
