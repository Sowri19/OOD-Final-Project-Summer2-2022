package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.sql.Date;

public class Registration {
    private int student_ID;
    private LocalDate register_Date;
    private LocalDate renwal_Date;
    private int years_Member;

    public Registration() {
        super();
    }

    public Registration(int student_id) {
        this.student_ID = student_id;
    }

    public Registration(int student_id, LocalDate registeredDate, LocalDate renewalDate, int yearsMember) {
        this.student_ID = student_id;
        this.register_Date = registeredDate;
        this.renwal_Date = renewalDate;
        this.years_Member = yearsMember;
    }

    public Registration(int student_id, LocalDate renewalDate, int yearsMember) {
        this.student_ID = student_id;
        this.renwal_Date = renewalDate;
        this.years_Member = yearsMember;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public Date getRegisteredDate() {
        return Date.valueOf(register_Date);
    }

    public void setRegister_Date(LocalDate register_Date) {
        this.register_Date = register_Date;
    }

    public Date getRenewalDate() {
        return Date.valueOf(renwal_Date);
    }

    public void setRenwal_Date(LocalDate renwal_Date) {
        this.renwal_Date = renwal_Date;
    }

    public int getYears_Member() {
        return years_Member;
    }

    public void setYears_Member(int years_Member) {
        this.years_Member = years_Member;
    }

    public String generateRegisterQuery() {
        return "INSERT INTO registration (student_id,created_date,renewal_date,years_member) VALUES(?,?,?,?);";
    }

    public String generateUpdateQuery() {
        return "Update registration SET renewal_date = DATE_ADD(renewal_date,INTERVAL 1 YEAR),years_member = years_member+1 WHERE student_id = "
                + this.student_ID + ";";
    }

}
