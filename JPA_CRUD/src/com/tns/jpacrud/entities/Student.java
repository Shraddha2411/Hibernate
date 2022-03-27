package com.tns.jpacrud.entities;

	import java.io.Serializable;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	
	
	@Entity(name="student")
	@Table(name="student")
	public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int studetid;
	private String name;
	
	public int getStudetid() {
		return studetid;
	}
	public void setStudetid(int studentId) {
		this.studetid = studetid; 
	}
	
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		
		
	}
