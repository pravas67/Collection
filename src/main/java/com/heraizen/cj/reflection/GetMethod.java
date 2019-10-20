package com.heraizen.cj.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethod {

	public static void main(String[] args) {
	
		try {
			Class	c = Class.forName("com.heraizen.cj.reflection.ReflctionMethods");
			Method[] methods=c.getMethods();
		
//			for(Method m:methods)
//			{
//				System.out.println("***********************************************");
//				System.out.println(m);
//				System.out.println("Method modifier :" + Modifier.toString(m.getModifiers()));
//			    System.out.println("Method name : "+m.getName());
//			    System.out.println("Metho return type: "+m.getReturnType());
//			    Class params[]=m.getParameterTypes();
//			    for(int i=0;i < params.length;i++){
//			       System.out.println("Param [i] "+" = "+params[i]);
//			    }
//			    System.out.println();
//			}
//			 Constructor constructors=c.getDeclaredConstructor();
//			   
//			     System.out.println(constructors);
			    
			     Field f=c.getField("n");
			     ReflctionMethods obj=new ReflctionMethods();
			      System.out.println("The name is :"+obj.n);
			      try {
					f.set(obj, "Jsl Tech");
					System.out.println("The name after modification :"+obj.n);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			      
//			    	Field fields[]=c.getDeclaredFields();
//			      for(int i=0;i < fields.length;i++){
//			        Field field=fields[i];
//			        System.out.println("Field Name : "+field.getName());
//			        System.out.println("Field Modifier: "+Modifier. toString(field.getModifiers()));
//			        System.out.println("Filed Type :"+field.getType());
//			        System.out.println("************************************");
//			      }
		} catch (ClassNotFoundException | SecurityException | NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
