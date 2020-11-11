package constructor;

public class Car {
	
	//Non static Variables defined at class level are known as instance variable 
	String colour;
	String model;
	int engine;
	
	//Default value of string variables will always be null
	//for integer its 0
	
	//Static variable defined at class level are known as class variable
	static int wheels;
	
	public void features()
	{
		//Variables defined in a functions are known as local variable
		int a=10;		
		System.out.println("Car features colour:"+colour+", model:"+model+" and engine size:"+engine+", wheels="+wheels);
	}
	
	//Constructor initializes the object
	//Default Constructor
	public Car()
	{
		
	}
	
	//Parameterized Constructor
	public Car(String col, String mod, int eng)
	{
		colour=col;
		model=mod;
		engine=eng;
	}
	
	//Constructor overloading: 2 or more Constructors with different parameters
	


}
