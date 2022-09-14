/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author raj
 */
public class Parent {

	private int parent_Id;
	private String parent_Name;
	private String parent_Add;
	private String parent_PhnNo;
	private int student_Id;

	public Parent() {
		super();

	}

	public Parent(String parentName, String parentAddress, String parentPhoneNo) {
		super();
		this.parent_Name = parentName;
		this.parent_Add = parentAddress;
		this.parent_PhnNo = parentPhoneNo;
	}

	public Parent(int parentId, String parentName, String parentAddress, String parentPhoneNo) {
		super();
		this.parent_Id = parentId;
		this.parent_Name = parentName;
		this.parent_Add = parentAddress;
		this.parent_PhnNo = parentPhoneNo;
	}

	public int getParent_Id() {
		return parent_Id;
	}

	public void setParent_Id(int parent_Id) {
		this.parent_Id = parent_Id;
	}

	public String getParent_Name() {
		return parent_Name;
	}

	public void setParent_Name(String parent_Name) {
		this.parent_Name = parent_Name;
	}

	public String getParent_Add() {
		return parent_Add;
	}

	public void setParent_Add(String parent_Add) {
		this.parent_Add = parent_Add;
	}

	public String getParent_PhnNo() {
		return parent_PhnNo;
	}

	public void setParent_PhnNo(String parent_PhnNo) {
		this.parent_PhnNo = parent_PhnNo;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String generateRegisterQuery() {
		return "INSERT INTO parent (p_name, address, phone) VALUES(?,?,?)";
	}
        
        public String updateParentTable(){
                return "UPDATE parent SET " +
                         " p_name = " +"'" +this.parent_Name+"'" +
                        ", address = " +"'"+ this.parent_Add +"'" +
                        ", phone = " +"'"+ this.parent_PhnNo +  "'" +
                        " WHERE parent_id =" +"'"+ this.parent_Id +"'" + ";";
        }
        
}
