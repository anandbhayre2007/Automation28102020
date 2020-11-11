package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		//ArrayList : Default size is 10, once we reach the maximum size, it will expand by 50%
		
		//Javatpoint: table of differences arraylist and linkedlist
		
		List<String> list= new ArrayList<>();
		
		list.add("Mohit");
		list.add("Yogesh");
		list.add("Rozina");
		list.add("Rozina");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("***********************");
		
		list= new LinkedList<>();
		
		list.add("Mohit");
		list.add("Yogesh");
		list.add("Rozina");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		System.out.println("***********************");
		
		list= new Vector<>();
		
		list.add("Mohit");
		list.add("Yogesh");
		list.add("Rozina");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
