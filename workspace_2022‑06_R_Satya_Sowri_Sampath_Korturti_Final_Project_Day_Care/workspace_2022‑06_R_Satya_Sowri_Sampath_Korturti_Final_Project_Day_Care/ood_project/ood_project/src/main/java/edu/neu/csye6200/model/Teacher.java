/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author raj
 */
public class Teacher {

    
    
    protected int employee_Id;
    protected String first_Name;
    protected String last_Name;
    protected String addres;
    protected String phnNo;
    protected Double rating;
    protected int class_Id;

    public Teacher(){}
    
    public Teacher(String fname,int classId){
        super();
        this.first_Name=fname;
        this.class_Id=classId; 
    }
    
    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getEmployee_Id() {
        return employee_Id;
    }


    public String getAddres() {
        return addres;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public Double getRating() {
        return rating;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
    }


    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
    public String updateStudentTeacher(){
            return "UPDATE teacher SET " +
                         " class_id = " +"'"+this.class_Id+"'"+
                        " WHERE class_id =" +"'"+ this.class_Id + "'"+";";
        }
    
}
