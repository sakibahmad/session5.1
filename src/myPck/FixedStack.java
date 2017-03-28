/*
 * class FixedStack that can accept a fixed numbers of integers.
 *  The size of the Stack will be specified in the constructor. 
 *  If the number of integers exceed the size,
 *   “Stack overflow” message should be displayed.
 */
package myPck;

//importing class arrays
import java.util.Arrays;

//FixedStack implements Interfce class
public class FixedStack implements Interfce {
	// defining class memeber variable
	private int maxSize;
	// initializing size of array as 5
	public int[] stack1 = new int[5];
	// top variable will points to position in an array
	public int top = -1;

	// constructor defining the size of stack
	public FixedStack(int s) {
		System.out.println("max size of stack " + s);

		maxSize = s;

	}

	// defing push method
	public void push(int I) {
		boolean stackFull = false;
		// top value comparision with maxSize of array
		if (top < maxSize - 1) {
			top++;
			stack1[top] = I;

		}
		// overflow condition
		else {
			System.out.println("I AM FROM FIXEDSTACK stack is full ");
			stackFull = true;
		}
		if (!stackFull) {
			// condtion to print value
			System.out.println(top + 1 + " VALUE pushed in stack");
			// printing the value of stack
			for (int i = 0; i <= top; i++) {
				System.out.println(stack1[i]);
			}
		}
	}

	// dffining pop method
	public int pop() {

		// element defination

		// storing the length of stack
		int length = stack1.length;

		if (stack1.length < 0) {
			System.out.println(" I AM FROM FIXED STACK Stack Underflow !");
		}

		int varistack = this.stack1[top--];
		System.out.println("popped element from FixedStack: " + varistack);
		return varistack;

	}
}
