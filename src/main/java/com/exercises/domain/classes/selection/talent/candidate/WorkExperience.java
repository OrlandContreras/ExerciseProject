package com.exercises.domain.classes.selection.talent.candidate;

import java.time.LocalDate;

class WorkExperience {
    private String experience;
    private String description;
    private LocalDate initialPeriod;
    private LocalDate finalPeriod;
    private String nameCompany;

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialPeriod() {
        return initialPeriod;
    }

    public void setInitialPeriod(LocalDate initialPeriod) {
        this.initialPeriod = initialPeriod;
    }

    public LocalDate getFinalPeriod() {
        return finalPeriod;
    }

    public void setFinalPeriod(LocalDate finalPeriod) {
        this.finalPeriod = finalPeriod;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public WorkExperience(String experience, String description, LocalDate initialPeriod, LocalDate finalPeriod, String nameCompany) {
        this.experience = experience;
        this.description = description;
        this.initialPeriod = initialPeriod;
        this.finalPeriod = finalPeriod;
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "experience='" + experience + '\'' +
                ", description='" + description + '\'' +
                ", initialPeriod=" + initialPeriod +
                ", finalPeriod=" + finalPeriod +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
