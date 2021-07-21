package com.sivaram.learning.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivaram.learning.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
