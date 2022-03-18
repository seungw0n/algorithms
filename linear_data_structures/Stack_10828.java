package DataStructures;
// BAEKJOON #10828
import java.util.*;

public class Stack_10828 {
	
	private int[] stack;
	private int size;
	
	public Stack_10828() {
		stack = new int[0];
		size = 0;
	}
	
	
	public void push(int x) {
		if(this.size == 0) {
			int[] tmp = new int[1];
			tmp[0] = x;
			this.stack = tmp;
		} else {
			int[] tmp = new int[size+1];
			for(int i = 0; i < size; i++) {
				tmp[i] = this.stack[i];
			}
			tmp[size] = x;
			this.stack = tmp;
		}
		this.size += 1;
	}
	
	public int pop() {
		if(size > 0) {
			this.size -= 1;
			int result = this.stack[this.size];
			int[] tmp = new int[this.size];
			for(int i = 0; i < size; i++) {
				tmp[i] = this.stack[i];
			}
			
			this.stack = tmp;
			return result;
		}
		return -1;
		
	}
	
	public int size() { return this.size; }
	public int empty() { if(this.size == 0) return 1; return 0; }
	public int top() {
		if(this.size == 0) return -1;
		else return this.stack[this.size-1];
	}
	
	public static void main(String[] args) {

		Stack_10828 stack = new Stack_10828();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			String command = sc.nextLine();
			String[] tmp = command.split(" ");
			int x;
			switch(tmp[0])
			{
				case "push":
					x = Integer.parseInt(tmp[1]);
					stack.push(x);
					break;
				case "pop":
					x = stack.pop();
					System.out.println(x);
					break;
				
				case "size":
					x = stack.size();
					System.out.println(x);
					break;
					
				case "empty":
					x = stack.empty();
					System.out.println(x);
					break;
				
				case "top":
					x = stack.top();
					System.out.println(x);
					break;
			}
		}
		sc.close();
	}
}
