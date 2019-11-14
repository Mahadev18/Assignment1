package Assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AssignLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		LinkedList<String> l = new LinkedList<>();
		char ch;
		do
		{
			System.out.println("Enter the element to add at the end : ");
			String element = s.next();
			l.add(element);
			System.out.println("wanna continue : ");
			ch = s.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("The elements of linked list : "+ l);
		
		System.out.println("--------------------------------------");
		
		// to iterate through all elements in a linked list.
		Iterator<String> ref = l.iterator();
		while(ref.hasNext())
		{
			System.out.println(ref.next());
		}
		
		System.out.println("--------------------------------------");
		
		//to iterate through all elements in a linked list starting at the specified position.
		System.out.println("Enter the position to start the iteration : ");
		int position = s.nextInt();
		Iterator<String> ref1 = l.listIterator(position);
		
		while(ref1.hasNext())
		{
			System.out.println(ref1.next());
		}
		
		System.out.println("--------------------------------------");
		
		//to iterate a linked list in reverse order.
		Iterator<String> ref2 = l.descendingIterator();
		
		while(ref2.hasNext())
		{
			System.out.println(ref2.next());
		}
		
		System.out.println("--------------------------------------");
		
		//to insert the specified element at the specified position in the linked list.
		System.out.println("The list before the insertion : "+ l );
		
		System.out.println("Enter the specified position to add the element : ");
		int n = s.nextInt();
		System.out.println("Enter the element to add into list : ");
		String ele1 = s.next();
		l.add(n,ele1);
		
		System.out.println("The list after the addition of the element : "+ l);
		
		System.out.println("---------------------------------------");
		
		//to insert the specified element at the front of a linked list.
		System.out.println("Enter the element to insert into the list at the front : ");
		String ele2 = s.next();
		l.addFirst(ele2);
		
		System.out.println("The list after the addition of element at the front : " + l);
		
		System.out.println("---------------------------------------");
		
		//to insert the specified element at the end of a linked list.
		System.out.println("Enter the element to be added at the end of the list : ");
		String ele3 = s.next();
		l.addLast(ele3);
		
		System.out.println("The list after the element at the end is : " + l);
		
		System.out.println("----------------------------------------");
		
		//to display the elements and their positions in a linked list.
		System.out.println("The elements of the list along with their position : ");
		
		for(int i = 0; i < l.size();i++)
		{
			System.out.println("position : "+ i + " and the element : " + l.get(i));
		}
		
		System.out.println("--------------------------------------------");
		
		//to remove first and last element from a linked list.
		System.out.println("The list : "+l);
		
		l.remove(0);
		l.remove(l.size());
		System.out.println("The list after removing the first and the last element : "+ l);
		
		System.out.println("---------------------------------------------");
		
		//to remove all the elements from a linked list.
		System.out.println("The list before removing : "+ l);
		l.removeAll(l);
		
		System.out.println("The size of list l : "+ l.size() );
		
		System.out.println("------------------------------------------------");
		
		//to join two linked lists.
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Amazon");
		l1.add("Google");
		
		System.out.println("The list l : "+ l);
		System.out.println("The list l1 : " + l1);
		l.addAll(l1);
		System.out.println("The list after adding l and l1 : "+ l);
		
		System.out.println("------------------------------------------------------");
		
		//to clone an linked list to another linked list.
		System.out.println("The first list : "+l);
		
		LinkedList<String> l2 = new LinkedList<>();
		l2 = (LinkedList) l.clone();
		
		System.out.println("The list after copying the entire list into the second list : "+ l2 );
		
		System.out.println("---------------------------------------------------------");
		
		//to remove and return the first element of a linked list.
		String first_ele = l.remove(0);
		System.out.println("The list after removing the first element : " + first_ele );
		System.out.println("The first element which is removed is : " + first_ele );
		
		System.out.println("----------------------------------------------------------");
		
		//to retrieve but does not remove, the first element of a linked list.
		System.out.println("The first element of Linkedlist : " + l.get(0) );
		System.out.println("The total list is : " + l );
		
		System.out.println("--------------------------------------------------------------");
		
		//to check if a particular element exists in a linked list.
		System.out.println("Enter the element to be searched : ");
		String search = s.next();
		
		System.out.println("The element is it present? : " + l.contains(search));
		
		System.out.println("------------------------------------------------------------");
		
		//to convert a linked list to array list.
		ArrayList<String> al = new ArrayList<>();
		al.addAll(l);
		
		System.out.println("The ArrayList : "+ al );
		
		System.out.println("--------------------------------------------------------");
	}

}
