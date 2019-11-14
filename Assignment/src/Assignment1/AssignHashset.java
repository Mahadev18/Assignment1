package Assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AssignHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		char ch;
		
		//to add student names in a hash set.	
		do {
			System.out.println("Enter the student name : ");
			String name = s.next();
			hs.add(name);
			System.out.println("do you wanna continue : ");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println(hs);
		
		System.out.println("--------------------------------------------");
		
		//to iterate through all elements in a hash list.
		for(String i : hs)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------");
		
		//to get the number of elements in a hash set.
		System.out.println("The size of Hash Set is : "+hs.size());
		
		System.out.println("--------------------------------------------");
		
		//to convert a hash set to a List/ArrayList.
		ArrayList<String> al = new ArrayList<>(hs);
		for(String i : al)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------");
		
		//to compare two hash set.
		HashSet<String> hs3 = new HashSet<>();
		do {
			System.out.println("Enter the names : ");
			String entry = s.next();
			hs3.add(entry);
			System.out.println("wanna continue press y : ");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("The two HashSets are they equal? : "+ hs.equals(hs3));
		
		System.out.println("--------------------------------------------");
		
		//to convert a hash set to an array.
		Object[] arr = hs.toArray();
		System.out.println("The array Elements are : ");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------------------------------------");
		
		//to empty an hash set.
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("smith");
		hs2.add("david");
		System.out.println(hs2);
		System.out.println("The size of HashSet before clearing : "+hs2.size());
		hs2.clear();
		System.out.println("The size of HashSet after clearing  : "+hs2.size());
		System.out.println("--------------------------------------------");
		
		//to compare two sets and retain elements which are same on both sets.
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("good");
		hs1.add("luck");
		hs1.add("raj");
		
		hs.retainAll(hs1);
		System.out.println("The HashSet which contains same elements in both : " + hs);
		
		System.out.println("--------------------------------------------");
		
		// to remove all of the elements from a hash set.
		hs.removeAll(hs);
		System.out.println("After removing all the elements the size is : "+hs.size());
		
		System.out.println("--------------------------------------------");
	}

}
