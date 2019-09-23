package com.actiTime.pageLibrary.loginPage;

public class Jimmy {

	public static void main(String[] args) {
		

	}
	
	public static void methodE()
	{
		TestClass obj1 = new TestClass();
		obj1.methodC();
		obj1.methodD();
//		obj1.methodA();
//		obj1.methodB(); Static methods should be accessed in static way
		TestClass.methodA();
		TestClass.methodB();
		//Below points for static methods in this class
//Cant call Static methods of other class directly in static method of this class
//Static methods of other class should be called in this class using the Class name classA.Staticmethod
//cant call non static method of other class directly in static method of this class 
//should be called using object created for ClassA
	}
	
	public static void methodF()
	{
		TestClass obj1 = new TestClass();
		obj1.methodC();
		obj1.methodD();
//		obj1.methodA();
//		obj1.methodB(); Static methods should be accessed in static way
		TestClass.methodA();
		TestClass.methodB();
		//Below points for static methods in this class
//Cant call Static methods of other class directly in static method of this class
//Static methods of other class should be called in this class using the Class name classA.Staticmethod
//cant call non static method of other class directly in static method of this class 
//should be called using object created for ClassA
	}
	
	public void methodG()
	{
//cant call non static methods of other class directly in non static method of this class
        //methodC();
		//methodD();
		TestClass obj1 = new TestClass();
		obj1.methodC();
		obj1.methodD();
//cant call Static methods of other class directly in non static method of this class
//should be called using the Class name classA.Staticmethod	
		//methodA();
		//methodB();
		TestClass.methodA();
		TestClass.methodB();
	}
	
	public void methodH()
	{
//cant call non static methods of other class directly in non static method of this class
        //methodC();
		//methodD();
		TestClass obj1 = new TestClass();
		obj1.methodC();
		obj1.methodD();
//cant call Static methods of other class directly in non static method of this class
//should be called using the Class name classA.Staticmethod	
		//methodA();
		//methodB();
		TestClass.methodA();
		TestClass.methodB();
	}

}
