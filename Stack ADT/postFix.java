import java.util.Scanner;

public class postFix {
	int stack[];
	int tos, MaxSize;

	void createStack(int size) {
		stack = new int[size];
		tos = -1; // if tos is at -1 the stack is empty because we insert elemnent on the zero
					// index of stack
		MaxSize = size;
	}

	void push(int e) {

		stack[++tos] = e;
	}

	boolean is_full() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	int pop() {
		/*
		 * int temp=stack[tos];
		 * 
		 * tos--; return temp;
		 */

		return stack[tos--];
	}

	boolean is_empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {
		return stack[tos];
	}

	void print_stack() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
    static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
    }
	
	static int postFixEval(String s) {
		
		postFix obj=new postFix();
		obj.createStack(s.length());
		String tokens[] = s.split("");
		for(String token: tokens) {
            if(isOperator(token)) {
                int second = obj.pop();
                int first = obj.pop();
                int result = 0;
                switch (token) {
                    case "+":
                      result = first + second;
                      break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                    case "^":
                        result = (int) Math.pow(first, second);
                        break;
                }
				obj.push(result); 
			}
            else {
                obj.push(Integer.parseInt(token));
            }
			
		}
		return obj.pop();
	}
	
	public static void main(String args[]) {
		
		
		String expression="34*25*+";
		System.out.println(postFixEval(expression));

	}
}