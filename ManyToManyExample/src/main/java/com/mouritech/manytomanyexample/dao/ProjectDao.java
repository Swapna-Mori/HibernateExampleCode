package com.mouritech.manytomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomanyexample.entity.Project;
import com.mouritech.manytomanyexample.util.HibernateUtil;


public class ProjectDao {
	public void saveProject(Project proj) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(proj);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Project getEmployee(Long prid) {
		Transaction transaction = null;
		Project projectById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			projectById = session.get(Project.class, prid);
			if(projectById!=null) {
				
				System.out.println("Employee details are = " + projectById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return projectById;
		
	}
}
