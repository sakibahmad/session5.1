/*
 * class VariableStack that can accept numbers more than its size. 
 * The size of the Stack will be specified in the constructor. 
 * If the number of integers exceed the size,
 *  the stack should automatically grow to accommodate the new element.
 */

		//importing class mypck
package myPck;
		//class variablestack with interfce
public class VariableStack implements Interfce {
		//efining the member vaariable
	private int stackSize;
	private int[] stackArr;
	private int top;
		//constructor calling
	public VariableStack(int size) {
		//defining the size of stack
		this.stackSize = size;
		this.stackArr = new int[stackSize];
		//top work as pointer
		this.top = -1;

	}
		//push method declaration
	public void push(int I) {
		//method defination
		//condition to check stack is full or not
		if (this.isStackFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
		//if full increasing the capacity	
			this.increaseStackCapacity();
		}
		System.out.println("Pushed value in VariableStack: " + I);
		this.stackArr[++top] = I;

	}
		//pop method declaration
	public int pop() throws Exception {
		// defination of pop method
		//condition to check stack is empty or not
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int fixstack = this.stackArr[top--];
		System.out.println("popped element from VariableStack: " + fixstack);
		return fixstack;

	}
		//method to increase the size

	private void increaseStackCapacity() {
		//defining new array with size more than 1 of previous array 

		int[] newStack = new int[this.stackSize + 1];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.stackSize = this.stackSize + 1;
	}
		//checking if stack is empty 
	public boolean isStackEmpty() {
		return (top == -1);
	}
		//checking for if stack is full
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}
		//main function
	public static void main(String[] args) {
		//object for VariableStack
		VariableStack stack = new VariableStack(2);
		//pushing the value
		 
			stack.push(45);
			stack.push(40);
			stack.push(43);
			stack.push(44);
			stack.push(477);
			stack.push(450);
			
		for (int i = 1; i < 4; i++) {
		//pop up the value
			try {
				stack.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FixedStack obj = new FixedStack(5);
		//Object for FixedStack
		System.out.println("Fixed stack operation");
		obj.push(4);
		obj.push(96);
		obj.push(5);
		obj.push(911);
		obj.push(91);
		obj.push(50);
		obj.pop();
		obj.pop();
		obj.pop();

	}
}
