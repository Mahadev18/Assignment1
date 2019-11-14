package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AssignArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to read the data from the user 
		Scanner s = new Scanner(System.in);
		
		// to create an ArrayList to add student names and adding some elements to it
		ArrayList<String> al = new ArrayList<>();
		
		char ch;
		do
		{
			System.out.println("Enter the name : ");
			String name = s.next();
			
			// To add the name into the ArrayList
			al.add(name);
			
			System.out.print("you wanna continue press y or Y :");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("--------------------------------------------");
		//To print out the collection
		System.out.println(al);
		
		System.out.println("---------------------------------------------");
		
		//To iterate through the ArrayList
		for(String i : al)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------------");
		
		//to insert an element into the array list at the first position.
		System.out.println("Enter the name to be inserted into the first position : ");
		String name = s.next();
		al.add(0,name);
		System.out.println(al);
		
		System.out.println("------------------------------------------------ ");
		
		//to retrieve an element (at a specified index) from a given array list.
		System.out.println("Enter the index value from 0 to "+ (al.size()-1) + "to be retrieved ");
		int n = s.nextInt();
		if(n < 0 && n > (al.size()-1 ) )
		{
			System.out.println("Enter the valid index number ");
		}
		else
		{
			String name1 = (String) al.get(n);
			System.out.println("The element retrieved from the ArrayList is "+name1);
		}
		
		System.out.println("--------------------------------------------------");
		
		// to update specific array element by given element.
		System.out.println("Enter the ArrayIndex of an element to be updated : ");
		int n1 = s.nextInt();
		if(n1 < 0 && n1 > (al.size()-1 ) )
		{
			System.out.println("Enter the valid index number ");
		}
		else
		{
			al.remove(n1);
			System.out.println("Enter the name to be updated : ");
			String name2 = s.next();
			al.add(n1,name2);
		}
		System.out.println(al);
		System.out.println("--------------------------------------------------------");
		
		//to remove the third element from a array list.
		al.remove(2);
		System.out.println(al);
		System.out.println("----------------------------------------------------------");
		
		// to search an element in a array list.
		System.out.println("Enter the element to be searched : ");
		String name3 = s.next();
		boolean res = al.contains(name3);
		if(res)
			System.out.println("The entered element is present ");
		else
			System.out.println("The entered element is not present ");
		
		System.out.println("-----------------------------------------------------------");
		
		//to sort a given array list.
		System.out.println("Before sorting : ");
		for(String i : al)
		{
			System.out.println(i);
		}
		Collections.sort(al);
		System.out.println("After sorting : ");
		for(String i : al)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------------------------------------");
		
		//to copy one array list into another.
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("sunny");
		al1.add("shaw");
		al.addAll(al1);
		for(String i : al)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------------------------------------");
		
		//to reverse elements in a array list.
		ArrayList<String> revlist = new ArrayList<>();
		for(int i = (al.size()-1);i >= 0;i--)
		{
			revlist.add(al.get(i));
		}
		System.out.println(al);
		System.out.println(revlist);
		
		System.out.println("------------------------------------------------------------");
		
		//to join two arraylist.
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("salman");
		al.addAll(al3);
		System.out.println(al);
		
		System.out.println("-------------------------------------------------------------");
		
		//to clone an array list to another array list.
		ArrayList<String> l = new ArrayList<>();
		l = (ArrayList) al.clone();
		System.out.println("The New ArrayList l After copying the entire list : " + l);
		
		System.out.println("----------------------------------------------------------------");
		
		//to empty an array list.
		al.clear();
		System.out.println("ArrayList  is cleared ");
		System.out.println("------------------------------------------------------------");
		
		//to test an array list is empty or not.
		System.out.println(al.isEmpty());
		
		System.out.println("-------------------------------------------------------------");
	}

}
