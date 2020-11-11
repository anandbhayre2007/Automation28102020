package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.privateFunction();
		obj.publicFunction();
		obj.protectedFunction();
		obj.noAccessModifiers();

	}
	
	public void publicFunction()
	{
		System.out.println("Public function");
	}
	
	private void privateFunction()
	{
		System.out.println("Private function");
	}
	
	void noAccessModifiers()
	{
		System.out.println("No Access Modifiers");
	}
	
	
	//Protected members can be accessed through out the project by using child class
	protected void protectedFunction()
	{
		System.out.println("Protected function");
	}

}
