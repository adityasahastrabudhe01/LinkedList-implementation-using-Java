public class LinkedList
{
	Node head;
	public void addLast(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}

	public void addFirst(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void insertBefore(int index, int data)
	{
		Node n = head;
		Node node = new Node();
		node.data = data;
		node.next = null;
		//if index is 0 
		//ie. if user wants to enter data 
		//in the start call addFirst 
		//method which do the same task.
		if(index == 0)
		{
			addFirst(data);
		}
		else
		{
			for(int i = 1; i < index; i++)
			{
				// System.out.println(n.data + " " + i);
				n = n.next;
				// System.out.println(n.data + " " + i);
			}
			// Node nodeWhereUserWantsData = n;
			node.next = n.next;
			n.next = node;
		}
	}

	public void insertAfter(int index, int data)
	{
		Node n = head;
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(index == 0)
		{
			node.next = head.next;
			head.next = node;
		}
		else
		{
			for(int i = 1; i <= index; i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index)
	{
		Node n = head;
		if(index == 0)
		{
			head = n.next;
		}
		else
		{
			for(int i = 1; i < index; i++)
			{
				n = n.next;
			}

			Node deletingNode = n.next;
			Node prevNode = n;
			Node nextToNextNode = n.next.next;
			System.out.println(prevNode.data + " " + deletingNode.data + " " +  nextToNextNode.data);
			if(n.next.next != null)
			{
				n.next = n.next.next;
			}
			else
			{
				n.next = null;
			}
		}
	}

	public void traverse()
	{
		Node node = head;
		int counter = 0;
		while(node.next != null)
		{
			System.out.print("(" + node.data + "|" + node.next + ") ----> ");
			node = node.next;
		}
		System.out.println(node.data);
	}
}