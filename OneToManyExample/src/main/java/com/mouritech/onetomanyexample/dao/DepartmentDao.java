package com.mouritech.onetomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetomanyexample.entity.Department;
import com.mouritech.onetomanyexample.util.HibernateUtil;



public class DepartmentDao {
	public void saveEmployee(Department dept) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(dept);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Department getDepartment(Long deptid) {
		Transaction transaction = null;
		Department deptById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			deptById = session.get(Department.class, deptid);
			if(deptById!=null) {
				
				System.out.println("Employee details are = " + deptById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return deptById;
		
	}
}
