import java.util.Scanner;

public class StackExample_Reverse
{

int stack[],tos,MaxSize;
    
    void createStack(int size){
        stack=new int[size];
        MaxSize=size;
        tos=-1;
        
        
        
        
    }
    void push(int a){
        
        
        stack[++tos]=a;
        /*tos++;
          stack[tos]=a; */
       
        
    }
    int pop(){
        
       /* int result=stack[tos];
        tos--;
        return result;*/
        
        return stack[tos--];
        
    }
    int peek(){
        
       
       
       return (stack[tos]);
        
        
        
    }
    boolean is_full(){
        
        if(tos==MaxSize-1)
           return true;
        else
           return false;
           
        
    }
    boolean is_empty(){
        
        if(tos==-1)
           return true;
        else
           return false;
           
        
    }
    
    void print_stack(){
        
        for(int i=tos;i>=0;i--){
            
            System.out.println(stack[i]);
        }
        
    }
    
    public static void main(String[] args)
   {
		 
		 Scanner sc=new Scanner(System.in);
		 StackExample_Reverse mystack=new StackExample_Reverse();
		 StackExample_Reverse minstack=new StackExample_Reverse();
		 System.out.println("Enter Size of stack");
		 int size=sc.nextInt();
		 
		 minstack.createStack(size);
		 mystack.createStack(size);
		 
		 for(int i=0;i<size;i++)
		 {
			 
			 
			 System.out.println("Enter number");
			 int num=sc.nextInt();
			 mystack.push(num);
		 }
		 System.out.println("*****************");

		 mystack.print_stack();

		 
		 for(int i=0;i<size;i++)
		 {
			 minstack.push(mystack.pop());
			 
		 }
		 

		 System.out.println("*****************");

		 mystack.print_stack();
		 
		 System.out.println("*****************");
	   minstack.print_stack();
		 
		 
		 
		 
	 }
    
	
}
