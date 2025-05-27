package com.hexaware.springbatch.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springbatch.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}