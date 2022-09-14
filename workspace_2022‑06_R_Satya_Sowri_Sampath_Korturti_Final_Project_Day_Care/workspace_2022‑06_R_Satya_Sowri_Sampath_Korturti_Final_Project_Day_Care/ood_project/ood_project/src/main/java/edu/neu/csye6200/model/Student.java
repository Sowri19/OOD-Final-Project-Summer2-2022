/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author raj
 */
public class Student {

	private int student_Id;
	private int parent_Id;
	private String studnt_Name;
	private int age;
	private String dob;
	private double gpa;
        private int class_Id;
        
        

	{
		student_Id = -1;
		studnt_Name = "";
		age = -1;
		dob = "";
		gpa = 0.0;

	}

	public Student(int studentId, String studentName, int age, String dateofBirth, double gpa) {
		super();
		this.student_Id = studentId;
		this.studnt_Name = studentName;
		this.age = age;
		this.dob = dateofBirth;
		this.gpa = gpa;
	}

	public Student(String studentName, String dateOfBirth, int age) {
		super();
		this.studnt_Name = studentName;
		this.dob = dateOfBirth;
		this.age = age;

	}
        
        public Student(int studentId, String studentName, String dateofBirth, double gpa) {
		super();
		this.student_Id = studentId;
		this.studnt_Name = studentName;
		this.dob = dateofBirth;
		this.gpa = gpa;
	}
        
        public Student(int studentId, int classId){
            super();
		this.student_Id = studentId;
                this.class_Id=classId;
        }
        
        
        

	public Student() {
		super();

	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudnt_Name() {
		return studnt_Name;
	}

	public void setStudnt_Name(String studnt_Name) {
		this.studnt_Name = studnt_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getParent_Id() {
		return parent_Id;
	}

	public void setParent_Id(int parent_Id) {
		this.parent_Id = parent_Id;
	}

	public String generateRegisterQuery() {
		return "INSERT INTO student (name, dob, age,parent_id) VALUES(?,?,?,?);";
	}

	public String generateStudentIdQuery() {
		return "SELECT student_id FROM student WHERE name=" + this.studnt_Name;
	}
        
        public String updateStudentTable(){
                return "UPDATE student SET " +
                         " name = " +"'"+this.studnt_Name+"'"+
                        ", dob = " +"'"+ this.dob +"'"+
                        ", gpa= " +"'"+ this.gpa +  "'"+
                        ", age= " +"'"+ this.age +  "'"+
                        " WHERE student_id =" +"'"+ this.student_Id + "'"+";";
        }
        
        public String showStudentTable(){
            return "SELECT s.student_id,s.name,s.age,s.dob,s.gpa,s.parent_id,p.name,p.address,p.phone "
                    + " FROM student s,parent p;";
        }
 
        public String updateStudentClass(){
                return "UPDATE student SET " +
                         " class_id = " +"'"+this.class_Id+"'"+
                        " WHERE student_id =" +"'"+ this.student_Id + "'"+";";
        }
        
       
}
