package com.mouritech.queryexample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mouritech.queryexample.model.Product;



public class QueryUpdateExample {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Product> updateQuery = session.createQuery
				("update Product set productPrice =:price where productId = :id");//here persistent class is Product

		updateQuery.setParameter("price", new Double(55000));
		updateQuery.setParameter("id", 126);

		int updateStatus = updateQuery.executeUpdate();
		System.out.println(updateStatus);
		
		tx.commit();
		
		
		sFactory.close();
		session.close();
		
	}
}
