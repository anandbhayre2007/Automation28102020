package variableAndDataType;

import functions.AccessModifiers;

public class TestAccessModifiersAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		
		AccessModifiers ref= new AccessModifiers();
		
		ref.publicFunction();
		
		//Protected members can be accessed through out the project by using child class
		
		TestAccessModifiersAtProjectLevel obj= new TestAccessModifiersAtProjectLevel();
		obj.protectedFunction();

	}

}
