package com.mouritech.queryexample;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mouritech.queryexample.model.Product;



public class QueryDeleteExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Product> deleteQuery = session.createQuery
				("delete from Product where productId = :id");//here persistent class is Product

		
		deleteQuery.setParameter("id", 123);

		int deleteStatus = deleteQuery.executeUpdate();
		System.out.println(deleteStatus);
		
		tx.commit();
		
		
		sFactory.close();
		session.close();
		
	}
}
