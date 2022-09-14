/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author raj
 */
public class ClassRoom {
    private int classId;
    private int stdntCap;
    private int stdntEnrolled;
    private int minimumAge;
    private int maximumAge;
    private int teacherCap;
    private int assignedTeachers;

    public int getClassId() {
        return classId;
    }

    public int getStdntCap() {
        return stdntCap;
    }

    public int getStdntEnrolled() {
        return stdntEnrolled;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public int getTeacherCap() {
        return teacherCap;
    }

    public int getAssignedTeachers() {
        return assignedTeachers;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setStdntCap(int stdntCap) {
        this.stdntCap = stdntCap;
    }

    public void setStdntEnrolled(int stdntEnrolled) {
        this.stdntEnrolled = stdntEnrolled;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    public void setTeacherCap(int teacherCap) {
        this.teacherCap = teacherCap;
    }

    public void setAssignedTeachers(int assignedTeachers) {
        this.assignedTeachers = assignedTeachers;
    }
    
}
