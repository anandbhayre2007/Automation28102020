package oops.inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone sp= new Smartphone();		
		sp.videoCalling();
		sp.calling();
		sp.texting();
		
		System.out.println("****************************");		
		Telephone phone= new Telephone();
		phone.calling();
		
		System.out.println("*****************************");
		
		Mobile mobile= new Mobile();
		mobile.texting();
		mobile.calling();
		

	}

}
