package Assignment1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class AssignTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		//to create a TreeMap of <studentId(Integer), studentName(String)>. Add some student reocrds with random student ids. 
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		char ch ;
		do
		{
			System.out.println("Enter the key value pair : ");
			int id = s.nextInt();
			String name = s.next();
			tm.put(id, name);
			System.out.println("wanna continue y or n ");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println(tm);
		
		System.out.println("---------------------------------------------------------");
		
		// to get all keys from the given a Tree Map.
		System.out.println("The keys present in the tree map are : "+ tm.keySet());
		
		System.out.println("---------------------------------------------------------");
		
		//to sort keys in Tree Map by using comparator.
		 @SuppressWarnings("unused")
		class Sample implements Comparator<String> {
			
			public int compare(String s1,String s2)
			{
				return s1.compareTo(s2);
			}
		}
		 
		 System.out.println("The TreeMap key value pair after sorting using keys : " + tm);
		 
		System.out.println("----------------------------------------------------------");
		
		//to get the first (lowest) key and the last (highest) key currently in a map.
		
		System.out.println("The first key of TreeMap is : " + tm.firstKey());
		System.out.println("The last key of TreeMap is : " + tm.lastKey());
		
		System.out.println("-----------------------------------------------------------");
		
		
		//to get a reverse order view of the keys contained in a given map.
		
		System.out.println("The usual view of TreeMap is : " + tm.keySet() );
		System.out.println("The reverse view of TreeMap is : " + tm.descendingKeySet() );
		
		System.out.println("-----------------------------------------------------------");
		
		//to delete all elements from a given Tree Map.
				System.out.println("The size of TreeMap before clearing : "+tm.size() );
				tm.clear();
				System.out.println("The size of TreeMap after clearing : "+tm.size() );
				
		System.out.println("----------------------------------------------------------");
	}

} 
