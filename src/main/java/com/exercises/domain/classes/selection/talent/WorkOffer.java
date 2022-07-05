package com.exercises.domain.classes.selection.talent;

import java.time.LocalDate;
import java.util.Arrays;

public class WorkOffer {
    private String jobTitle;
    private String descriptionWorkOffer;
    private LocalDate publishDate;
    private LocalDate finishDate;
    private Company company;
    private String contractType;
    private String[] requeriments;
    private String[] optionalRequeriments;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescriptionWorkOffer() {
        return descriptionWorkOffer;
    }

    public void setDescriptionWorkOffer(String descriptionWorkOffer) {
        this.descriptionWorkOffer = descriptionWorkOffer;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String[] getRequeriments() {
        return requeriments;
    }

    public void setRequeriments(String[] requeriments) {
        this.requeriments = requeriments;
    }

    public String[] getOptionalRequeriments() {
        return optionalRequeriments;
    }

    public void setOptionalRequeriments(String[] optionalRequeriments) {
        this.optionalRequeriments = optionalRequeriments;
    }

    public WorkOffer() {
        this.requeriments = new String[5];
        this.optionalRequeriments = new String[3];
    }

    @Override
    public String toString() {
        return "WorkOffer{" +
                "jobTitle='" + jobTitle + '\'' +
                ", descriptionWorkOffer='" + descriptionWorkOffer + '\'' +
                ", publishDate=" + publishDate +
                ", finishDate=" + finishDate +
                ", company=" + company +
                ", contractType='" + contractType + '\'' +
                ", requeriments=" + Arrays.toString(requeriments) +
                ", optionalRequeriments=" + Arrays.toString(optionalRequeriments) +
                '}';
    }
}
