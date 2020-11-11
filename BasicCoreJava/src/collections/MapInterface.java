package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {		
		
		Map<Integer, String> map= new HashMap<>();
		
		map.put(5, "Ashish");
		map.put(9, "Babita");
		map.put(3, "Mohit");
		
		//System.out.println(map.get(2));
		
		Set<Integer> keys=map.keySet();

		for(int key:keys)
		{
			System.out.println(map.get(key));
		}
	}

}
