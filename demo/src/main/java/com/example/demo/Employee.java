package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {
    @Column(name = "fullName", nullable = false)
    private String fullName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "homePhone", nullable = false)
    private String homePhone;

    @Column(name = "cellPhone", nullable = false)
    private String cellPhone;

    @Column(name = "emailAddress", nullable = false)
    private String emailAddress;

    @Column(name = "socialNumber")
    private int socialNumber;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "martialStatus")
    private String martialStatus;

    @Column(name = "spouseName")
    private String spouseName;

    @Column(name = "spouseEmployer")
    private String spouseEmployer;

    @Column(name = "spouseWorkPhone")
    private String spouseWorkPhone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(int socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseEmployer() {
        return spouseEmployer;
    }

    public void setSpouseEmployer(String spouseEmployer) {
        this.spouseEmployer = spouseEmployer;
    }

    public String getSpouseWorkPhone() {
        return spouseWorkPhone;
    }

    public void setSpouseWorkPhone(String spouseWorkPhone) {
        this.spouseWorkPhone = spouseWorkPhone;
    }
}
