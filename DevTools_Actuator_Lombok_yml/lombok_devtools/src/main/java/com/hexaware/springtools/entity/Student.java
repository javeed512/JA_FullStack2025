package com.hexaware.springtools.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;



@AllArgsConstructor
@Setter
@Getter
@ToString
@Slf4j

@Table(name="Student_Details")
@Entity
public class Student {
	
		@Id
		private  int sid;
		private  String sname;
		private   LocalDate dob;
	
		public Student() {
			
			log.info("this is student default constructor");
		}
	
	
	

}
