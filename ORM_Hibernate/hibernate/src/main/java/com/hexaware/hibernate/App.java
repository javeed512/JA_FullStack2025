package com.hexaware.hibernate;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    SessionFactory  sessionFactory =		HibernateUtil.getSessionFactory();
    
    		Session  session =			sessionFactory.openSession();
    	
    		System.out.println(session);
    		
    	Transaction		tx = session.beginTransaction();
    	
		/*
		 * Employee emp = new Employee();
		 * 
		 * emp.setEid(101); emp.setEname("king"); emp.setSalary(9000);
		 * 
		 * 
		 * Serializable ser = session.save(emp); System.out.println(ser);
		 */
    	
    	
    		Employee emp =	session.get(Employee.class, 101);
    	
    			System.out.println(emp);
    			
				/*
				 * emp.setEname("king khan"); emp.setSalary(50000);
				 * 
				 * session.update(emp);
				 * 
				 * Employee emp2 = new Employee(102, "tommy", 60000);
				 * 
				 * session.saveOrUpdate(emp2);
				 */
    			
    			
    			
    			session.delete(emp);
    			
    			
    		
    		tx.commit();
    	
    }
}
