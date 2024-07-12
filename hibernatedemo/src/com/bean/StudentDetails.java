package com.bean;

public class StudentDetails {
	private int S_id;
	private String S_Name;
	private String S_Add;
	public StudentDetails(int s_id,String s_name,String s_Add) {
		super();
		S_id=s_id;
		S_Name= s_name;
		S_Add= s_Add;
	}
	
	
	@Override
	public String toString() {
		return "StudentDetails [S_id=" + S_id + ", S_Name=" + S_Name + ", S_Add=" + S_Add + "]";
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getS_Name() {
		return S_Name;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	public String getS_Add() {
		return S_Add;
	}
	public void setS_Add(String s_Add) {
		S_Add = s_Add;
	}

		
	}
		

