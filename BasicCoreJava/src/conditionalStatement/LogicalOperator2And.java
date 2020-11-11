package conditionalStatement;

public class LogicalOperator2And {

	public static void main(String[] args) {
		
		//IIT and MHCET
		//60>= in 12th, 60>=10th
		
		int a=60;
		int b=59;
		
		if(a>=60 && b>=60)
		{
			System.out.println("You are eligible");
		}else {
			System.out.println("You are not eligible");
		}

	}

}
