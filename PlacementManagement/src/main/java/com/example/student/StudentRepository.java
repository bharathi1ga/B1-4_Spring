package com.example.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer>
{

	Optional<Student> findByHallticketno(Integer hallticketno);

	void save(Certificate certificate);
	
}
