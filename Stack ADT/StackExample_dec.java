import java.util.Scanner;

public class StackExample_dec {
	
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
    
    
    
    

    public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 
		 		 
		 StackExample_dec ob=new StackExample_dec();
		 StackExample_dec ob1=new StackExample_dec();
		 
		 ob.createStack(6);
		 ob1.createStack(6);
		 
		 	while(!ob.is_full() && ob1.is_empty()) {
		 		System.out.println("Enter first number");
		 		int num=sc.nextInt();

		 		ob.push(num);
		 		ob1.push(num);
		 	}
		 	
		 	while(!ob.is_full() && !ob1.is_full()) {
		 		System.out.println("Enter a number");
		 		int num=sc.nextInt();
		 		ob.push(num);
		 		if(num<ob1.peek())
		 			ob1.push(num);

		 	}
		 		
		 	ob1.print_stack();
		 	
		 	ob1.pop();
		 	
		 	System.out.println("After pop0:"+        ob1.peek());
    }
		 


}
