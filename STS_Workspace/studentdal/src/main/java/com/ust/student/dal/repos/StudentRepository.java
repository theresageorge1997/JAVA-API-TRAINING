package com.ust.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ust.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
