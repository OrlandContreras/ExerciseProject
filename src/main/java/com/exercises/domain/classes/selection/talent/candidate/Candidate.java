package com.exercises.domain.classes.selection.talent.candidate;

import java.util.Arrays;

public class Candidate {
    private String firstName;
    private String middleName;
    private String lastName;
    private Address address;
    private String universityTitle;
    private String nameCollege;
    private int experienceYears;
    WorkExperience[] workExperiences; // This class only is accesed from same package
    References[] references; // This class only is accesed from same package

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUniversityTitle() {
        return universityTitle;
    }

    public void setUniversityTitle(String universityTitle) {
        this.universityTitle = universityTitle;
    }

    public String getNameCollege() {
        return nameCollege;
    }

    public void setNameCollege(String nameCollege) {
        this.nameCollege = nameCollege;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public WorkExperience[] getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(WorkExperience[] workExperiences) {
        this.workExperiences = workExperiences;
    }

    public References[] getReferences() {
        return references;
    }

    public void setReferences(References[] references) {
        this.references = references;
    }

    public Candidate() {
        this.workExperiences = new WorkExperience[3];
        this.references = new References[2];
    }

    public Candidate(String firstName, String middleName, String lastName, Address address, String universityTitle, String nameCollege, int experienceYears, WorkExperience[] workExperiences, References[] references) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.universityTitle = universityTitle;
        this.nameCollege = nameCollege;
        this.experienceYears = experienceYears;
        this.workExperiences = workExperiences;
        this.references = references;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", universityTitle='" + universityTitle + '\'' +
                ", nameCollege='" + nameCollege + '\'' +
                ", experienceYears=" + experienceYears +
                ", workExperiences=" + Arrays.toString(workExperiences) +
                ", references=" + Arrays.toString(references) +
                '}';
    }
}
