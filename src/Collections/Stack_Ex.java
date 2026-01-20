package Collections;

import java.util.Stack;

public class Stack_Ex {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(40);
		st.push("Hello");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search(10)); //gives index if found or -1
		while(!st.empty()) {
			System.out.print(st.peek()+" ");
			st.pop();
		}
		
	}
}
