import java.util.Scanner;

public class Stackexample_Sort {

    int stack[];
    static int tos;
    int MaxSize;

    void createStack(int size) {
        stack = new int[size];
        MaxSize = size;
        tos = -1;
    }

    void push(int a) {
        stack[++tos] = a;
    }

    int pop() {
        return stack[tos--];
    }

    int peek() {
        return stack[tos];
    }

    boolean is_full() {
        return tos == MaxSize - 1;
    }

    boolean is_empty() {
        return tos == -1;
    }

    void print_stack(int[] stackToPrint) {
        for (int i = tos; i >= 0; i--) {
            System.out.println(stackToPrint[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stackexample_Sort mystack = new Stackexample_Sort();
        Stackexample_Sort minstack = new Stackexample_Sort();

        System.out.println("Enter size");
        int size = sc.nextInt();

        mystack.createStack(size);
        minstack.createStack(size);

        while (!mystack.is_full()) {
            System.out.println("Enter number");
            int num = sc.nextInt();
            mystack.push(num);
        }
        System.out.println("Enddd");

        // Sorting algorithm using an additional stack
    	while(!mystack.is_empty())
		{
			// pop out the first element
			int tmp = mystack.pop();
		
			// while temporary stack is not empty and
			// top of stack is lesser than temp
			while(!minstack.is_empty() && minstack.peek() 
												< tmp)
			{
				// pop from temporary stack and 
				// push it to the input stack
			mystack.push(minstack.pop());
			}
			
			// push temp in temporary of stack
			minstack.push(tmp);
    }
}
}