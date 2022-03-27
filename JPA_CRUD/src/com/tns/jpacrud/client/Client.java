package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {
	
	public static void main(String[] args) {
	//Debug this program as Debug -> Debug as Java 
	
	StudentService StudentService = new StudentServiceImpl();
	Student student = new Student();
	
	// Create Operation
	
	/*
	 * student.setStudetid(1); student.setName("Amar");
	 * StudentService.addStudent(student);
	 */
	 
	
	//at this breakpoint, we have added one record to table
	// Retrieve Operation
	
	/*
	 * student = StudentService.findStudentById(13); System.out.print("ID:"+
	 * student.getStudetid()); System.out.println(" Name:"+student.getName());
	 */
    
	 //Update Operation
		
		
		  student = StudentService.findStudentById(20);
		  student.setName("Sachin Tendulkar"); 
		  StudentService.updateStudent(student);
		 
		 
    
	//at this breakpoint, we have updated record added in first section
	
	
	/*
	 * student = StudentService.findStudentById(21);
	 * System.out.print("ID:"+student.getStudetid());
	 * System.out.println(" Name:"+student.getName());
	 */
    
	//at this breakpoint, record is removed from table
	// Delete Operation
	
	/*
	 * student = StudentService.findStudentById(18);
	 * StudentService.removeStudent(student);
	 * System.out.println("End of program/Life cycle completed...");
	 */
	 
}
	}
