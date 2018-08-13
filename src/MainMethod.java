
public class MainMethod {
	public static void main(String args[]) 	{
		LinkedListClone myLinkedList = new LinkedListClone();
		myLinkedList.insert(12);
		myLinkedList.insert(34);
		myLinkedList.insert(5);
		myLinkedList.insert(54);
//		myLinkedList.insertAtStart(99);
//		myLinkedList.insertAtLocation(8, 2);
		myLinkedList.deleteAtLocation(1);
		myLinkedList.show();
		
	}
}
