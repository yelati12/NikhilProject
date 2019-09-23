package com.actiTime.pageLibrary.loginPage;

public class TestClass {

	public static void main(String[] args) {
		

	}
	
	public static void methodA()
	{
		System.out.println("This is a static methodA");
		//calling Static-//Static
		TestClass.methodB();
		methodB();
//		TestClass obj = new TestClass();
//		obj.methodC();
	//obj.methodB(); As methodB is a static method it should be accessed using
	//its name directly or u can call it with class name(TestClass.methodB) in other classes
	}
	
	public static void methodB()
	{
		System.out.println("This is a static methodB");
		//calling Non-Static-//Static
	//methodC(); as methodC() is a non static method it should be called by creating object
	// TestClass obj = new TestClass(); obj.methodC();
		TestClass obj = new TestClass();
		obj.methodC();
	}
	
	public void methodC()
	{
		System.out.println("This is a Non-static methodC");
		//Static-//Non-Static
		methodA();
		TestClass.methodA();
//		TestClass obj = new TestClass();
//		obj.methodA(); Static method should be accessed in static way
	}
	
	public void methodD()
	{
		System.out.println("This is a Non-static methodD");
		//Non-Static-//Non-Static
		methodC();
		TestClass obj = new TestClass();
		obj.methodC();
	}
	
	//This works in Same Class//
	//calling Static method in other -//Static method   ex1
	//object not required and not even classname required
	//Non-Static-//Non-Static  object not required   ex4
	//calling Static-//Non-Static  object not required   ex3
	//calling Non-Static-//Static   ****Object Required********   ex2
	 
	//Calling Static Methods
	//To call static method in any method(static/non-static) in same class
	//we dont need to create object or use a class name
	//To call static method in any method(static/non-static) in different class
	//we dont need to create object but we need to use class name
	
	//Calling Non Static Methods
	//To call Non-Static method in Non-Static method you don't need object in same class
	//To call Non-Static method in a Static method you need object in same class
	//To call Non-Static method in any method(static/non-static) in different class
	//you need to create an object
	
		

}
