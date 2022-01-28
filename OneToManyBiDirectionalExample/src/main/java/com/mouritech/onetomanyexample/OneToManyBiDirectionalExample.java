package com.mouritech.onetomanyexample;

import java.time.LocalDate;
import java.util.List;

import com.mouritech.onetomanyexample.dao.DepartmentDao;
import com.mouritech.onetomanyexample.dao.EmployeeDao;
import com.mouritech.onetomanyexample.entity.Department;
import com.mouritech.onetomanyexample.entity.Employee;

public class OneToManyBiDirectionalExample {

	public static void main(String[] args) {
		
		EmployeeDao empDao = new EmployeeDao();
		DepartmentDao deptDao = new DepartmentDao();
		
		Employee emp = new Employee("Krishna", "R", "krishr@gmail.com", 
													LocalDate.of(1978, 11, 21));
		empDao.saveEmployee(emp);
		
		//create some departments
		Department dept = new Department("GCP");
		dept.setEmployee(emp);
		deptDao.saveDepartment(dept);
		
		Department dept1 = new Department("SAP");
		dept1.setEmployee(emp);
		deptDao.saveDepartment(dept1);
		//empDao.saveEmployee(emp);
		
		System.out.println("Employee By ID  =" +empDao.getEmployee(1L));
		/*
		 * System.out.println("Department For ID  =" ); List<Department> deptList =
		 * empDao.getEmployee(1L).getDepartments(); System.out.println(deptList);
		 */
	}

}
