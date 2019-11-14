package Assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssignHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		//to create a HashMap of key as student id(Integer) and value as Student name (String). Add some entries and print the hash map.		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		char ch;
		do
		{
			System.out.println("Enter student id and name : ");
			int id = s.nextInt();
			String name = s.next();
			hm.put(id, name);
			System.out.println("wanna continue y or n : ");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println(hm);
		
		System.out.println("---------------------------------------------------");
		
		//to iterate over all the entries in the HashMap.
		for(Map.Entry<Integer, String> i : hm.entrySet())
		{
			System.out.println("key : "+ i.getKey() + " value : "+ i.getValue() );
		}
		
		System.out.println("---------------------------------------------------");
		
		//to get the specified value with the specified key in a HashMap.
		System.out.println("Enter the key for which a specified value will exctracted : ");
		int n = s.nextInt();
		System.out.println("The value at " + n + " key is " + hm.get(n));
		
		System.out.println("---------------------------------------------------");
		
		// to count the number of key-value (size) mappings in a map.
		System.out.println("The number of key-value pair in mapping is : " + hm.size());
		
		System.out.println("---------------------------------------------------");
		
		//to copy all of the mappings from the specified map to another map.
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(7, "Cristiano");
		hm1.put(10, "Messi");
		System.out.println("hm : "+ hm );
		System.out.println("hm1 : "+ hm1);
		hm.putAll(hm1);
		System.out.println("after copying hm1 to hm : "+ hm);
		
		System.out.println("---------------------------------------------------");
		
		//to remove all of the mappings from a map.
		hm1.clear();
		System.out.println("The size : "+ hm1.size());
		
		System.out.println("---------------------------------------------------");
		
		//to test if a map contains a mapping for the specified key.
		System.out.println("Enter random key to check whether the mapping has specified key : ");
		int key = s.nextInt();
		System.out.println("Does the mapping contains the specific key? : "+ hm.containsKey(key));
		
		System.out.println("---------------------------------------------------");
		
		//to test if a map contains a mapping for the specified value.
		System.out.println("Enter the random value to check whether the mapping has specific value : ");
		String value = s.next();
		System.out.println("Does the mapping contains the specific value? : " + hm.containsValue(value));
		
		System.out.println("---------------------------------------------------");
		
		//to get a set view of the keys contained in this map.
		System.out.println("The set view of keys present in the map is : " + hm.keySet() );
		
		System.out.println("---------------------------------------------------");
		
		//to get a collection view of the values contained in this map.
		System.out.println("The collction view of values contained in the map : " + hm.values());
		
		System.out.println("---------------------------------------------------");
	}

}
