package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		//RBI -- WebDriver
		//HDFC - ChromeBrowser
		//Kotak - FirefoxDriver
		//Union - Opera		
		RBI bank1= new Kotak();	
		bank1.creditCard(); //get
		bank1.savingAccount(); //sendKeys
		bank1.debitCard();   //click
		bank1.currentAccount(); //close
		
		System.out.println("*****************");
		bank1= new HDFC();	
		bank1.creditCard(); //get
		bank1.savingAccount(); //sendKeys
		bank1.debitCard();   //click
		bank1.currentAccount(); //close
		
		System.out.println("*********************");
			
		bank1= new Union();		
		bank1.creditCard(); //get
		bank1.savingAccount(); //sendKeys
		bank1.debitCard();   //click
		bank1.currentAccount(); //close
	}
	
	public static void test1()
	{
		
		bank(new HDFC());
		bank(new Kotak());
		bank(new Union());
		
	}
	
	public static void bank(RBI bank1)
	{
		bank1.creditCard(); //get
		bank1.savingAccount(); //sendKeys
		bank1.debitCard();   //click
		bank1.currentAccount(); //close
		
	}
	
	

}
