package edu.neu.csye6200.model;
import java.sql.*;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

public class Vaccination extends Student {
    private String stdntvac_Id;
    private String nxt_DueDate;
    private int temp_StdntID;
    private String lastVacc_Date;
    private LocalDate[] last_Vacdate; //last_vaccine_dose
    private LocalDate[] next_Date; //next_dose

    public Vaccination(int studentId, String studentName, int age, String dateofBirth, double gpa, String svid, String nextDueDate, int tempSID, String lastVaccineDate, LocalDate[] ld, LocalDate[] nd) {
        super(studentId, studentName, age, dateofBirth, gpa);
        this.stdntvac_Id = svid;
        this.nxt_DueDate = nextDueDate;
        this.temp_StdntID = tempSID;
        this.lastVacc_Date = lastVaccineDate;
        this.last_Vacdate = ld;
        this.next_Date = nd;
    }

    public Vaccination(String svid, String nextDueDate, int tempSID, String lastVaccineDate, LocalDate[] ld, LocalDate[] nd) {
        this.stdntvac_Id = svid;
        this.nxt_DueDate = nextDueDate;
        this.temp_StdntID = tempSID;
        this.lastVacc_Date = lastVaccineDate;
        this.last_Vacdate = ld;
        this.next_Date = nd;
    }

    public Vaccination() {

    }

    public String getStdntvac_Id() {
        return stdntvac_Id;
    }

    public void setStdntvac_Id(String stdntvac_Id) {
        this.stdntvac_Id = stdntvac_Id;
    }

    public String getNxt_DueDate() {
        return nxt_DueDate;
    }

    public void setNxt_DueDate(String nxt_DueDate) {
        this.nxt_DueDate = nxt_DueDate;
    }

    public int getTemp_StdntID() {
        return temp_StdntID;
    }

    public void setTemp_StdntID(int temp_StdntID) {
        this.temp_StdntID = temp_StdntID;
    }

    public String getLastVacc_Date() {
        return lastVacc_Date;
    }

    public void setLastVacc_Date(String lastVacc_Date) {
        this.lastVacc_Date = lastVacc_Date;
    }

    public LocalDate[] getLast_Vacdate() {
        return last_Vacdate;
    }

    public void setLast_Vacdate(LocalDate[] last_Vacdate) {
        this.last_Vacdate = last_Vacdate;
    }

    public LocalDate[] getNext_Date() {
        return next_Date;
    }

    public void setNext_Date(LocalDate[] next_Date) {
        this.next_Date = next_Date;
    }
}



