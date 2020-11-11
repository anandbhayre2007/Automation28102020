package functions;

public class Script {

	public static void main(String[] args) {
		
		Library.sum(10, 20);
		
		Library.print();
		
		Library ref= new Library();
		ref.fun1();
		
		String data=ref.printName("Rozina");
		System.out.println(data);
		
		AccessModifiers ref2= new AccessModifiers();
		
		ref2.publicFunction();
		ref2.noAccessModifiers();
		ref2.protectedFunction();
		//ref2.pri
	}

}
