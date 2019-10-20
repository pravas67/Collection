package com.heraizen.cj.coll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	static EmployeeContainerImpl empImpl;
	static Employee emp;
	@BeforeAll
	public static void objectCreation()
	{
		empImpl=new EmployeeContainerImpl();
		emp=new Employee();
		
	}
	@BeforeEach
	public void add()
	{
		Employee obj1=new Employee();
	
	obj1.setEmpname("Virat");
	obj1.setEmpno(101);
	obj1.setEmpjob("captain");
	empImpl.addEmployee(obj1);
	
	Employee obj2=new Employee();
	
	obj2.setEmpname("Dhoni");
	obj2.setEmpno(102);
	obj2.setEmpjob("keeper");
	empImpl.addEmployee(obj2);
	
	Employee obj3=new Employee();
	
	obj3.setEmpname("Rohit");
	obj3.setEmpno(103);
	obj3.setEmpjob("vice captain");
	empImpl.addEmployee(obj3);
	}
	@Test
	public void addEmpTest()
	{
		Employee obj=new Employee();
		obj.setEmpname("Pravas");
		obj.setEmpno(100);
		obj.setEmpjob("xyz");
		assertEquals(true, empImpl.addEmployee(obj));
	}
	@Test
	public void deleteEmpTest()
	{
		assertEquals(true, empImpl.deleteEmployee(102));
	}
	@Test
	public void viewEmpTest()
	{
		assertEquals(3, empImpl.viewEmployees().size());
	}
	@Test
	public void viewEmpByNoTest()
	{
		Employee obj1=new Employee();
		
		obj1.setEmpname("Virat");
		obj1.setEmpno(101);
		obj1.setEmpjob("captain");
		
		assertEquals(obj1.toString(), empImpl.viewEmployee(101).toString());
	}
	

}
