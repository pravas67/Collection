package com.heraizen.cj.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetInterface {

	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("com.heraizen.cj.reflection.Example2");
			System.out.println("The super class is : "+c.getSuperclass());
		     Class cls[]=c.getInterfaces();
		     System.out.println("The Implemented interface are :");
		     for(Class cl:cls){
		       System.out.println(cl);
		     }
		     System.out.println();
		     System.out.println();
		     Method method=c.getMethod("fullName",new Class[] {int.class,int.class});
		     int a=(int)method.invoke(new Example1(),new Object[]{6,7});
		     System.out.println("The value is :"+a);
		} catch (ClassNotFoundException |
				NoSuchMethodException |
				SecurityException | 
				IllegalAccessException |
				IllegalArgumentException |
				InvocationTargetException e
				) {
			e.printStackTrace();
		}
	     

	}

}
