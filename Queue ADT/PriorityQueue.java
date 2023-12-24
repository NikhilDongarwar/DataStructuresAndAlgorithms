import java.util.Scanner;

public class PriorityQueue {

	{
		System.out.println("Priority Queue");
	}
	
int front,rear,maxsize,queue[];
	
	void createQueue(int size) {
		
		maxsize=size;
		queue=new int[maxsize];
		front=0;
		rear=-1;
	}
	void enqueue(int num) {
		
		
		rear++;
		queue[rear]=num;
		 for(int i=front;i<rear;i++)//passes :bubble sort
	       {for(int j=front;j<rear;j++)//sort
	           {
	               if(queue[j]>queue[j+1])
	               {
	                   int temp=queue[j];
	                   queue[j]=queue[j+1];
	                   queue[j+1]=temp;
	               }
	               
	           }
	       }
		
	}
	boolean is_full() {
		
		if(rear==maxsize-1)
			return true;
		else
			return false;
	}
   int dqueue() {
		
		
		int result=queue[front];
		front++;
		return result;

	
	}
   boolean is_empty() {
		
		if(rear<front)
			return true;
		else
			return false;
	}
   void print_queue() {
	   
	   for(int i=front;i<=rear;i++) {
		   System.out.println(queue[i]);
	   }
   }
   public static void main(String[] args) 
   {
   	    
   	    Scanner sc=new Scanner(System.in);
   	    System.out.println("Enter size");
   	    int size=sc.nextInt();
   	    PriorityQueue obj=new PriorityQueue();
   	    obj.createQueue(size);
   	    int ch;
   	    do{
   	        System.out.println("1.equeue\n2.dqueue \n3.print ");
   	        ch=sc.nextInt();
   	        
   	        
   	        
   	        switch(ch)
   	        {
   	           
   	           case 1:
   	               if(!obj.is_full()){
   	                   
   	                   System.out.println("Enter number:");
   	                   int no=sc.nextInt();
   	                   obj.enqueue(no);
   	                   System.out.println("equeued "+no);
   	                   
   	               }
   	               
   	               break;
   	               
   	         case 2:
   	             if(!obj.is_empty()){
   	                 
   	                 
   	                 int result=obj.dqueue();
   	                 System.out.println(result+" dqueue");
   	                 
   	             }
   	             
   	             break;
   	             
   	        	         
   	   case 3:
   	       if(!obj.is_empty()){
   	           
   	           System.out.println("Elements on queue:");
   	           obj.print_queue();
   	           
   	       }
   	       break;
   	       
   	  default:
   	      System.out.println("Enter valid number");
   	    
   	       }
   	      
   	    }
   	    while(ch!=0); 
   		
   }



}
