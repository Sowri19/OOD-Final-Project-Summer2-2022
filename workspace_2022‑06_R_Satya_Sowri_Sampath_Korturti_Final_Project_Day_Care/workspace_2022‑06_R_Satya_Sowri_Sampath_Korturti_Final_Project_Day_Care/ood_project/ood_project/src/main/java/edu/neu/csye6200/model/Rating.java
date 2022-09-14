/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author raj
 */
public class Rating {
    private int employee_ID;
    private int year;
    private int rating;

    public Rating(int empID, int year, int rating) {
        this.employee_ID = empID;
        this.year = year;
        this.rating = rating;
    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rating{" +
                "empID=" + employee_ID +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
    
}
