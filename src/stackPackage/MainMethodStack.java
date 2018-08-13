package stackPackage;

public class MainMethodStack {
	public static void main(String[] args) {
		StackClone myStack = new StackClone();
		myStack.pop();
		System.out.println("\n");
		System.out.println("Size of the stack : "+myStack.size());		
		System.out.println("Is stack empty? " + myStack.isEmpty());

		myStack.push(3);
		myStack.push(5);
		myStack.push(65);
		myStack.push(53);
		myStack.pop();
		myStack.push(95);		
		System.out.println("\n***** Values on Stack *****");
		myStack.show();
		System.out.println("\n");
		System.out.println("Size of the stack : "+myStack.size());
		myStack.peek();
		System.out.println("Is stack empty? " + myStack.isEmpty());
	}
}
