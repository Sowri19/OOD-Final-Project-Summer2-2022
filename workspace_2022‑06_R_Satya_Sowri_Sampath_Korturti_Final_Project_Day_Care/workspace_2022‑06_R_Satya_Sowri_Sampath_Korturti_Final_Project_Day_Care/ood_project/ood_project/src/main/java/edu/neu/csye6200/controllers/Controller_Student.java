/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controllers;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.model.Parent;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Period;
import edu.neu.csye6200.model.Student;
import java.sql.PreparedStatement;
import java.time.LocalDate;

/**
 *
 * @author prudhvi
 */
public class Controller_Student {

    private static Controller_Student controller_student;


    private int calculateAge(Date dob) {
        return Period.between(dob.toLocalDate(), new Date(System.currentTimeMillis()).toLocalDate()).getMonths();
    }


    public void annexParentStudent(String name, String dob, String parentName, String parentPhone,
            String parentAddress) {
        try {

            DB database = DB.getObj();

            Date sdob = Date.valueOf(dob);

            int age = calculateAge(sdob);
            // create student obj
            Student student = new Student(name, sdob.toString(), age);
            Parent parent = new Parent(parentName, parentAddress, parentPhone);

            PreparedStatement statementPrepared = database.conn.prepareStatement(parent.generateRegisterQuery(),
                    Statement.RETURN_GENERATED_KEYS);
            statementPrepared.setString(1, parent.getParent_Name());
            statementPrepared.setString(2, parent.getParent_Add());
            statementPrepared.setString(3, parent.getParent_PhnNo());

            int rowsModified = statementPrepared.executeUpdate();
            if (rowsModified == 0) {
                throw new Exception("Creating user failed, no rows affected.");
            }

            int pid = -1;
            try (ResultSet set = statementPrepared.getGeneratedKeys()) {
                if (set.next()) {
                    pid = set.getInt(1);
                }
                set.close();
            }
            // db.query(p.generateRegisterQuery());
            // int parentId = db.getGeneratedKey();
            // db.query(p.generateRegisterQuery());
            // int parentId = db.getGeneratedKey();
            // db.query(p.generateRegisterQuery());
            // int parentId = db.getGeneratedKey();
            // db.query(p.generateRegisterQuery());
            // int parentId = db.getGeneratedKey();

            student.setParent_Id(pid);

            statementPrepared = database.conn.prepareStatement(student.generateRegisterQuery(), Statement.RETURN_GENERATED_KEYS);
            statementPrepared.setString(1, student.getStudnt_Name());
            statementPrepared.setString(2, student.getDob());
            statementPrepared.setInt(3, student.getAge());
            statementPrepared.setInt(4, student.getParent_Id());

            rowsModified = statementPrepared.executeUpdate();
            if (rowsModified == 0) {
                throw new Exception("Creating user failed, no rows affected.");
            }

            int sid = -1;
            try (ResultSet set = statementPrepared.getGeneratedKeys()) {
                if (set.next()) {
                    sid = set.getInt(1);
                }
                set.close();
            }

            RegistrationController.getObj().addStudent(sid);

            // db.query(s.generateRegisterQuery());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Controller_Student getObj() {
        if (controller_student == null) {
            controller_student = new Controller_Student();
        }
        return controller_student;
    }

    public void modifyParentStudent(int studentId, String studentName, String dateofBirth, double gpa,
            int parentId, String parentName, String parentAddress, String parentPhoneNo) throws InterruptedException {

        DB database = DB.getObj();



        Date date = Date.valueOf(dateofBirth);

        int age = calculateAge(date);
        Student student = new Student(studentId, studentName, date.toString(), gpa);
        Parent parent = new Parent(parentId,parentName, parentAddress, parentPhoneNo);

        student.setAge(age);

        database.update(student.updateStudentTable());
        Thread.sleep(200);
        database.update(parent.updateParentTable());



    }

    public void viewParentStudentTable(int studentId, String studentName, String dateofBirth, double gpa,
            int parentId, String parentName, String parentAddress, String parentPhoneNo) {

        DB database = DB.getObj();

        Date date = Date.valueOf(dateofBirth);

        int age = calculateAge(date);
        Student student = new Student(studentId, studentName, date.toString(), gpa);
        Parent parent = new Parent(parentId,parentName, parentAddress, parentPhoneNo);

        student.setAge(age);

        database.query(student.showStudentTable());

        // PreparedStatement insert =
        // ResultSetMetaData rss =


    }
    
    public void modifyStudent(int studentId, int classId){
        DB database = DB.getObj();
        Student student = new Student(studentId,classId);
//        Teacher t = new Teacher(teacherName,classId);
        database.update(student.updateStudentClass());
//        db.update(t.updateStudentTeacher());
        
    }


}
