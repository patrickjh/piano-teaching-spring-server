package controllers;

import org.springframework.stereotype.Component;

/**
 * Created by patrick on 6/17/2017.
 */


public class newStudentForm {

    public newStudentForm(){}

    private String telephoneNumber;
    private String parentsName;
    private String emailAddress;
    private String availableTimes;
    private String ZipCode;
    private int howManyStudents;
    private String studentsNames;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAvailableTimes() {
        return availableTimes;
    }

    public void setAvailableTimes(String availableTimes) {
        this.availableTimes = availableTimes;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public int getHowManyStudents() {
        return howManyStudents;
    }

    public void setHowManyStudents(int howManyStudents) {
        this.howManyStudents = howManyStudents;
    }

    public String getStudentsNames() {
        return studentsNames;
    }

    public void setStudentsNames(String studentsNames) {
        this.studentsNames = studentsNames;
    }
}
