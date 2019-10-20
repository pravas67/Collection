package com.heraizen.cj.coll;

import java.util.Set;

interface EmployeeContainier {
	boolean addEmployee(Employee emp);

	boolean deleteEmployee(int empno);

	Employee viewEmployee(int empno);

	Set<Employee> viewEmployees();

}
