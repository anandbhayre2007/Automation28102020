package oops.abstraction;

//1. You can't have abstract methods inside a concrete class
//2. Abstract class: classes which have abstract keyword in their signature and can't be instantiated
//3. Concrete class: classes which do not have abstract keyword in their signature and can be instantiated

public abstract class MSWord {
	
	//Signature of your method/function
	public abstract void save(); 
	/*
	{
		//Body
	}
*/
	
	public abstract void insert();
	public abstract void table();
	public abstract void share();
	public abstract void convert();
	public abstract void font();
	
}
