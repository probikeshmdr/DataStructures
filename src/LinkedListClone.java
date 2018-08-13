
public class LinkedListClone {
	// Creating a head node
	private Node headNode;
	
	//Method to insert a data
	public void insert(int data) {		
		//Creating a new insertion data
		Node newInsertionNode = new Node();
		
		//Setting data and next pointer for a new node
		newInsertionNode.setData(data);		
		newInsertionNode.setNext(null);
		
		/*
		 * Checking whether there is any value in head node
		 * */
		if(headNode == null) 
		{
			headNode = newInsertionNode;
		} else {
			Node tempNode = headNode;			
			while(tempNode.getNext() != null){
				tempNode = tempNode.getNext();				
			}
			tempNode.setNext(newInsertionNode);				
		}
		
	}
	
	//Method to insert a node at the beginning
	public void insertAtStart(int data) {
		Node newInsertionNode = new Node();
		newInsertionNode.setData(data);
		newInsertionNode.setNext(null);
		newInsertionNode.setNext(headNode);
		headNode = newInsertionNode;
	}
	
	public void insertAtLocation(int data, int index) {
		Node newInsertionNode = new Node();
		newInsertionNode.setData(data);
		newInsertionNode.setNext(null);
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node tempNode = headNode;
			for(int i=0; i<index-1; i++) {
				tempNode = tempNode.getNext();				
			}
			newInsertionNode.setNext(tempNode.getNext());
			tempNode.setNext(newInsertionNode);			
		}
	}
	public void deleteAtLocation(int index) {
		if(index == 0) {
			headNode = headNode.getNext();			
		} else {			
			Node tempNode = headNode;
			Node tempNode2 = null;
			for(int i=0; i<index-1;i++) {
				tempNode = tempNode.getNext();				
			}
			tempNode2 = tempNode.getNext();
			tempNode.setNext(tempNode2.getNext());
			System.out.println("Deleted value : " + tempNode2.getData());
		}
	}
	
	public void show() {
		Node displayNode = headNode;
		while(displayNode.getNext() != null) {
			System.out.println(displayNode.getData());
			displayNode = displayNode.getNext();
		}
		System.out.println(displayNode.getData());
	}
}
