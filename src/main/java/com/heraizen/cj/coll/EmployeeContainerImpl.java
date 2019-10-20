package com.heraizen.cj.coll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeContainerImpl implements EmployeeContainier {

	Set<Employee> set=new HashSet<>();
	Map<Integer,Employee> map=new HashMap<>();
	@Override
	public boolean addEmployee(Employee emp) {
		
		if(map.get(emp.getEmpno())==null)
		{
			map.put(emp.getEmpno(), emp);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empno) {
		
		if(map.keySet().contains(empno))
		{
			 map.remove(empno);
			 return true;
		}
		return false;
		
		
	}

	@Override
	public Employee viewEmployee(int empno) {
		if(map.keySet().contains(empno))
		{
			return map.get(empno);
		}
		return null;
	}

	@Override
	public Set<Employee> viewEmployees() {
		Set<Employee> emp=new HashSet<>();
		for(Integer keys:map.keySet())
		{
			emp.add(map.get(keys));
		}
		return emp;
	}

}
