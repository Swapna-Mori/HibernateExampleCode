package com.mouritech.queryexample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mouritech.queryexample.model.Product;



public class QueryExample {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		
		@SuppressWarnings("unchecked")
		Query<Product> selectQuery = session.createQuery("from Product");//here persistent class is Product
		selectQuery.setFirstResult(1);
		selectQuery.setMaxResults(4);
		List<Product> listOfProducts = selectQuery.list();
		

		Iterator<Product> itr = listOfProducts.iterator();
		
		while(itr.hasNext()) {
			Product p = itr.next();
			System.out.println("Product Id = " + p.getProductId());
			System.out.println("Product Id = " + p.getProductName());
			System.out.println("Product Id = " + p.getProductPrice());
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}
		
		
		
		
		
		sFactory.close();
		session.close();
		
	}

}
