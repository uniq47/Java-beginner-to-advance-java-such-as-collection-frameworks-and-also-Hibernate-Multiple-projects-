package com.uniam;

import java.util.List;

import com.uniam.entity.Student;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.NativeQuery;

public class NativeSQLEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Session ses = SessionUtility.getSession(); Transaction tx =
		 * ses.beginTransaction();
		 * 
		 * NativeQuery query =
		 * ses.createSQLQuery("select s.* from student s Where sno >=:num");
		 * query.setParameter("num", 3); //Entity Queries mapped with Entity class name
		 * query.addEntity(Student.class );
		 * 
		 * List <Student> stdRecords = query.getResultList();
		 * 
		 * stdRecords.stream().forEach(s->System.out.println(s.getSno()+"\t"+
		 * s.getSname()+"\t" + s.getSadd()));
		 * 
		 * 
		 * SessionUtility.closeSession(ses);
		 */

		Session ses = SessionUtility.getSession();
		Transaction tx = ses.beginTransaction();

		/*
		 * NativeQuery query = ses.
		 * createSQLQuery("select s.sno,s.sname,s.sadd from student s Where sno >=:num"
		 * ); query.setParameter("num", 3); // Entity Queries mapped with Entity class
		 * name // scalar queries mapped Hibernate Pojo class
		 * 
		 * query.addScalar("sno"); query.addScalar("sname"); query.addScalar("sadd");
		 * 
		 * List<Object[]> stdRecords = query.getResultList(); for (Object[] std :
		 * stdRecords) { System.out.println(std[0] + "\t" + std[1]); }
		 * 
		 * SessionUtility.closeSession(ses);
		 */
		
		NativeQuery query = ses.createSQLQuery("insert into student values(:sno,:sname,:sadd)");
		query.setParameter("sno", 6);
		query.setParameter("sname","Nabin" );
		query.setParameter("sadd","Usa");
		
		int count = query.executeUpdate();
		tx.commit();
		
		

	}

}