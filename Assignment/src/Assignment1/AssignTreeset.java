package Assignment1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AssignTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		//to create a new tree set, add some random numbers (Integer) and print out the tree set.
		TreeSet<Integer> ts = new TreeSet<>();
		char ch;
		do {
			System.out.println("Enter some random numbers : ");
			int i = s.nextInt();
			ts.add(i);
			System.out.println("Continue y or n : ");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("The tree set elements are : "+ ts);
		
		System.out.println("-------------------------------------------------------");
		
		//to iterate through all elements in a tree set.
		Iterator i = ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("-------------------------------------------------------");
		
		//to add all the elements of a specified tree set to another tree set.
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(40);
		ts1.add(20);
		System.out.println("The TreeSet elements are : "+ts1);
		ts.addAll(ts1);
		System.out.println(ts);
		
		System.out.println("-------------------------------------------------------");
		
		//to create a reverse order view of the elements contained in a given tree set.
		Iterator j = ts.descendingIterator();
		System.out.println("The reverse order of TreeSet is : ");
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
			
		System.out.println("--------------------------------------------------------");
		
		//to get the first and last elements in a tree set.
		System.out.println(ts);
		System.out.println("The first element of TreeSet is : " + ts.first());
		System.out.println("The Last element of TreeSet is : " + ts.last());
		
		System.out.println("---------------------------------------------------------");
		
		//to get the number of elements in a tree set.
		System.out.println("The number of elements in TreeSet ts is : "+ts.size() );
		
		System.out.println("---------------------------------------------------------");
		
		//to find the numbers less than 7 in a tree set.
		System.out.println("Tree set elements which are less than 7 are : ");
		for(Integer n : ts)
		{
				if(n < 7)
					System.out.println(n);
		}
		
		System.out.println("---------------------------------------------------------");
		
		//to get the element in a tree set which is greater than or equal to the given element.
		System.out.println("Enter the integer to obtain its equal and greater elements : ");
		int num = s.nextInt();
		for(Integer k : ts)
		{
			if(k >= num)
				System.out.println(k);
				
		}
		
		System.out.println("---------------------------------------------------------");
		
		//to retrieve and remove the first element of a tree set.
		System.out.println("removing first element : ");
		ts.pollFirst();
		System.out.println(ts);
		
		System.out.println("----------------------------------------------------------");
		
		//to retrieve and remove the last element of a tree set.
		System.out.println("removing last element : ");
		ts.pollLast();
		System.out.println(ts);
		
		System.out.println("----------------------------------------------------------");
		
		//to remove a given element from a tree set.
		System.out.println("Enter the element to be removed : ");
		int ele = s.nextInt();
		ts.remove(ele);
		System.out.println("Treeset elements are : " + ts);
		
		System.out.println("----------------------------------------------------------");
	}

}
