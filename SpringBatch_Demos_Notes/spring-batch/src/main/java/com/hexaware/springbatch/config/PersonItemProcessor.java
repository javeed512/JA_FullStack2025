package com.hexaware.springbatch.config;


import org.springframework.batch.item.ItemProcessor;

import com.hexaware.springbatch.entity.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {
        String firstName = person.getFirstName().toUpperCase();
        String lastName = person.getLastName().toUpperCase();
        
        Person p1 =new Person(firstName, lastName);
        
        	if(p1.getFirstName().startsWith("A")) {
        		
        		
        		return p1;
        		
        	}
           
        

        return  null;
    }
}