public class Main
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();

		//Adding Data at Last of LinkedList and Traverse LinkedList
		System.out.println("Adding data at Last in LinkedList");
		list.addLast(5);
		list.addLast(15);
		list.addLast(25);
		list.addLast(35);
		list.traverse();
		System.out.println();

		//Adding Data at First of LinkedList and Traverse LinkedList
		System.out.println("Adding data at First in LinkedList");
		list.addFirst(95);
		list.addFirst(105);
		list.traverse();
		System.out.println();

		//Inserting Data Before LinkedList and Traverse LinkedList
		System.out.println("Inserting data before index in LinkedList");
		list.insertBefore(3, 75);
		list.traverse();
		System.out.println();

		System.out.println("Inserting data after index in LinkedList");
		list.insertAfter(5, 55);
		list.traverse();
		System.out.println();

		//Deleting Data at index and Traverse LinkedList
		System.out.println("Deleting data at index in LinkedList");
		list.deleteAt(0);
		list.traverse();
		System.out.println();
	}
}