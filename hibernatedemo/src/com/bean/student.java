package com.bean;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
@Entity
@Table(appliesTo="student")
public class student {


	private int s_id;
	
	
	private String Name;
	private String Adress;
	private int Marks;
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public String toString() {
		return "student [s_id=" + s_id + ", Name=" + Name + ", Adress=" + Adress + ", Marks=" + Marks + ", getS_id()="
				+ getS_id() + ", getName()=" + getName() + ", getAdress()=" + getAdress() + ", getMarks()=" + getMarks()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
