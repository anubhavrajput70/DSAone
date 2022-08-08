package linkedList;
class Node
{
	int data;
	Node next;
	public Node (int data)
	{
	this.data=data;
	this.next=null;
	}
}
public class DeletionInLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(6);
		head.next = new Node(4);
		head.next.next = new Node(6);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(1);
		int val=6;
		head=deleteNode(head,val);
		printList(head);
		
	}
	public static Node deleteNode(Node head,int val)
	{	
		  while (head != null && head.data == val)
	            head = head.next;
	        Node curr = head;
	      while (curr != null && curr.next != null)
	      {
	            if (curr.next.data == val)
	                curr.next = curr.next.next;
	            else 
	                curr = curr.next;
	      }
	        return head;
	}
	public static void printList(Node head)
	{
		System.out.print("list  ");
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
}
