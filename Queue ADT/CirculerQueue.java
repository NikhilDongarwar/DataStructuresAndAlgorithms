import java.util.Scanner;

public class CirculerQueue {
int front,rear,maxsize,queue[];
int count=0;
	
	void createQueue(int size) {
		
		maxsize=size;
		queue=new int[maxsize];
		front=0;
		rear=-1;
	}
	void enqueue(int num) {
		
		
		rear=(rear+1)%maxsize;
		queue[rear]=num;
		count++;
	
	}
	boolean is_full() {
		
		if(count==maxsize)
			return true;
		else
			return false;
	}
   int dqueue() {
		
		
		int result=queue[front];
		front=(front+1)%maxsize;
		count--;
		return result;

	
	}
   boolean is_empty() {
		
		if(count==0)
			return true;
		else
			return false;
	}
   void print_queue() {
	   
	   int i=front;
	   int c=0;
	   while(c<count) {
		   
		   System.out.println(queue[i]);
		   i=(i+1)%maxsize;
		   c++;
	   }
   }
   public static void main(String[] args) 
   {
   	    
   	    Scanner sc=new Scanner(System.in);
   	    System.out.println("Enter size");
   	    int size=sc.nextInt();
   	    CirculerQueue obj=new CirculerQueue();
   	    obj.createQueue(size);
   	    int ch;
   	    do{
   	        System.out.println("1.equeue\n 2.dqueue \n  3.print ");
   	        ch=sc.nextInt();
   	        
   	        
   	        
   	        switch(ch)
   	        {
   	           
   	           case 1:
   	               if(!obj.is_full()){
   	                   
   	                   System.out.println("Enter number");
   	                   int no=sc.nextInt();
   	                   obj.enqueue(no);
   	                   System.out.println("equeued"+no);
   	                   
   	               }
   	               
   	               break;
   	               
   	         case 2:
   	             if(!obj.is_empty()){
   	                 
   	                 
   	                 int result=obj.dqueue();
   	                 System.out.println(result+"dqueue");
   	                 
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
