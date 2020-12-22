package com.ust.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.student.dal.entities.Student;
import com.ust.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
	Student student = new Student();
	student.setName("Theresa");
	student.setCourse("API");
	student.setFee(30d);
	
	studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
	Student student = studentRepository.findById(1l).get();
	System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
	Student student = studentRepository.findById(1l).get();
	student.setFee(40d);
	studentRepository.save(student);
	}
	
	  @Test
	  public void testDeleteStudent()
	  {
	    //Student student = studentRepository.findById((long) 3).get();
	    //student.setFee(40d);  
	    Student student = new Student();
	    student.setId(1l);
	    studentRepository.delete(student);
	    //System.out.println(student);
	  }
  
//  @Test
//  public void testDeleteStudent()
//  {
//    //Student student = studentReporsitory.findById(1).get();
//    //student.setFee(40d);
//    Student student = new Student();
//    student.setId((long) 5);  
//    studentRepository.delete(student);
//    System.out.println(student);
//  }
	
}
