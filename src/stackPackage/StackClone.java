package stackPackage;

public class StackClone {
	private final int MAXSIZE = 10;
	private int stack[] = new int[MAXSIZE];
	private int top = 0;
	public void push(int data) {
		if(top == MAXSIZE) {
			System.out.println("Stack is full!");
		}else {
			stack[top++] = data;
		}
	}
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			top -=1;
			data = stack[top];
			System.out.println("Popped data = "+data);
			stack[top] = 0;			
		}
		return data;
	}
	public void peek() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			top -=1;
			data = stack[top];
			System.out.println("At the top of stack : "+ data);
		}
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		if(top <=0) {
			return true;
		}else {
			return false;
		}
	}
	public void show() {
		for(int stackData : stack) {
			System.out.print(stackData + " ");
		}
	}
	
}
