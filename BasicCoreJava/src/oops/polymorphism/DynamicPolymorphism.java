package oops.polymorphism;

import oops.inheritance.*;

public class DynamicPolymorphism {
	
	//You can use reference of your parent class for the object of your child class
	//In this scenario you can call only those functions which are present in your parent class
	//In this scenario your overridden methods will get call from your child class

	public static void main(String[] args) {
		
		Telephone mobile= new Mobile();
		mobile.calling();
		//mobile.texting();
		
		//We need to achieve inheritance 
		//We need to have to minimum one overridden method in child class
		//We must have reference of parent class for the object of child class
		//We must call an overridden method using the reference of parent class
		
		
		

	}

}
