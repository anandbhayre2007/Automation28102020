package constructor;

public class User {

	public static void main(String[] args) {
		
		Car kia= new Car();
		kia.colour="Silver";
		kia.engine=1200;
		kia.model="Seltos";
		kia.features();
		
		Car vw= new Car();
		vw.colour="White";
		vw.model="Polo";
		vw.engine=1600;
		vw.features();
		
		Car honda= new Car();
		honda.colour="Black";
		honda.model="City";
		honda.engine=1600;
		honda.features();
		

	}

}
