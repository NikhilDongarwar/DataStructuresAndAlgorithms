import java.util.Scanner;

public class InfixPostFix {
	private char stack[];
    private int tos;
    private int maxSize;

    
    public InfixPostFix(int size) {
        stack = new char[size];
        maxSize = size;
        tos = -1;
    }

    private void push(char e) {
        if (!isFull()) {
            tos++;
            stack[tos] = e;
        } else {
            System.out.println("Stack overflow");
        }
    }

    private char pop() {
        if (!isEmpty()) {
            char temp = stack[tos];
            tos--;
            return temp;
        } else {
            System.out.println("Stack underflow");
            return '\0'; // Return a default value in case of underflow
        }
    }

    private char peek() {
        if (!isEmpty()) {
            return stack[tos];
        } 
        return 0;
    }

    private boolean isFull() {
        return tos == maxSize - 1;
    }

    private boolean isEmpty() {
        return tos == -1;
    }

    private void printStack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }
    private static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    // Function to check if the given character is an operand
    private static boolean isOperand(char ch) {
        return (Character.isLetterOrDigit(ch));
    }

    // Function to get the precedence of an operator
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression:");
        String exp = sc.next();
        int size = exp.length();
        InfixPostFix obj = new InfixPostFix(size);
        String res = "";
        

        for (int i =0; i<size; i++) 
        {
            char ch = exp.charAt(i);
            if (InfixPostFix.isOperand(ch))
            {
                res = res + ch;
            } 
            else if(ch=='('){
            	obj.push(ch);
            }
            else if(ch==')'){
            	while(!obj.isEmpty() && obj.peek()!='(')
            		res=res+obj.pop();
            	obj.pop(); //to pop ')'
            }
            else if(InfixPostFix.isOperator(ch))
            {
            	while(InfixPostFix.getPrecedence(ch)<=InfixPostFix.getPrecedence(obj.peek())) {
            		res=res+obj.pop();
            	}
            	obj.push(ch); //if precedence of incoming operator is greater then push
            	
            		
                
                
            }
        }

        // Pop remaining operators from stack
        while (!obj.isEmpty()) {
            res = res + obj.pop();
        }

        

        System.out.println("Prefix Expression: " + res);

        // Close the scanner
        sc.close();
    }


}
