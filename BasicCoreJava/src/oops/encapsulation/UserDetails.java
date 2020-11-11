package oops.encapsulation;

public class UserDetails {
	
	private int age;
	private String name;
	
	public int getAge() {
		
		if(age==0)
		{
			System.out.println("Age is 0");
		}
		return age;
	}
	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
