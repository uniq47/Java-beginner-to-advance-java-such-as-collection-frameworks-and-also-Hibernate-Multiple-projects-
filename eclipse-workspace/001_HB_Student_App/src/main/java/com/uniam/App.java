package com.uniam;

import java.util.List;

import com.uniam.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
// Step1: read the Configuratoin file 

		Configuration cfg = new Configuration();

		cfg.configure("com\\uniam\\config\\hibernate.cfg.xml");

		// step 2 : Build Session Factory

		SessionFactory factory = cfg.buildSessionFactory();

		// step 3 : Create a Session Object

		Session ses = factory.openSession();
		// every session transaction is disabled,
		Transaction tx = ses.beginTransaction();

		// fetch data from database

		/*
		 * Query q = ses.createQuery("from Student "); List<Student> stdRecords =
		 * q.getResultList();
		 * 
		 * // for(Student std : stdRecords ) // System.out.println(std.getSno()+"\t" +
		 * std.getSname() +"\t" + std.getSadd());
		 * 
		 * stdRecords.stream().forEach(std -> { System.out.println(std.getSname() + "\t"
		 * + std.getSno() + "\t" + std.getSadd()); });
		 */

		/*
		 * //Query q = ses.createQuery("select s from Student s where sno>=3  "); Query
		 * q = ses.createQuery("select s from Student s where sno=3  "); List<Student>
		 * stdRecords = q.getResultList();
		 * 
		 * // for(Student std : stdRecords ) // System.out.println(std.getSno()+"\t" +
		 * std.getSname() +"\t" + std.getSadd());
		 * 
		 * stdRecords.stream().forEach(std -> { System.out.println(std.getSname() + "\t"
		 * + std.getSno() + "\t" + std.getSadd()); });
		 */
		
		//Query q = ses.createQuery("select s from Student s where sno>=3  ");
				
		/*
		 * //Named Parameters Query q =
		 * ses.createQuery("from Student  where sno=>:no  "); // ? is place holder or we
		 * can use >=:no// (named patameters ) q.setParameter("no", 101);
		 * 
		 * List<Student> stdRecords = q.getResultList();
		 * 
		 * stdRecords.stream().forEach(std->{ System.out.println(std.getSname() + "\t" +
		 * std.getSno() + "\t" + std.getSadd()); });
		 */
		
		// fetching specific column
		
		/*
		 * Query q =
		 * ses.createQuery("select sno,sname,sadd from Student where sno>=:num");
		 * q.setParameter("num", 4); List <Object[]> stdRecords = q.getResultList();
		 * 
		 * for(Object obj[] : stdRecords ) { System.out.println(obj[0] + "\t"+ obj[1] +
		 * "\t" + obj[2]); }
		 */
		
		//to update the student
		/*
		 * Query q = ses.createQuery("update Student set sadd=:address");
		 * 
		 * q.setParameter("address", "usa"); int count = q.executeUpdate();
		 * System.out.println(count); tx.commit();
		 */
			
		// update the epecific row
		/*
		 * Query q = ses.createQuery("update Student set sadd =:address where sno =:no"
		 * ); q.setParameter("address", "America"); q.setParameter("no", 1); int count =
		 * q.executeUpdate(); System.out.println(count); tx.commit();
		 */
		
		Query q = ses.getNamedQuery("find.all");
		List <Student>stdRecords = q.getResultList();
		stdRecords.stream().forEach(std->System.out.println(std.getSno()+ "\t" + std.getSname() + std.getSadd()));
				
	}
}
