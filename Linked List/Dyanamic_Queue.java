import java.util.Scanner;

public class Dyanamic_Queue {
	
	 Node front,rear;
	    
	    void createList()
	    {
	        front=null;
	        rear=null;//root is never created but assigned as per need
	        //the 1st node is called root
	    }


	void Enqueue(int e)
    {   Node n=new Node(e);
        if(rear==null) {
            rear=n;
            front=n;
        }
        else
        {
           
           rear.next=n;
           rear=n;//3
        }
        System.out.println("Inserted");       
    }
     void Dqueue()
    {
        if(front==null)
            System.out.println("Empty List");       
        else
        {
          Node t=front;//1
          if(front==rear)
        	  front=rear=null;
          front=front.next;//2
          System.out.println(t.data+" deleted");       
        }
    }
     void print_Queue()
     {  if(front==null)
                 System.out.println("Empty List");       
        else
        {
        Node t=front;
            while(t!=null)
            {
                System.out.print("| "+t.data+" |->");
                t=t.next;
            }
        }   
     }
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         Dyanamic_Queue obj=new Dyanamic_Queue();
         obj.createList();
         int ch;
         do
         {
           System.out.println("\n1.Enqueue\n2.Dqueue\n3.Print_all");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int e=in.nextInt();
                       obj.Enqueue(e);
                       break;
               case 2:
                       //System.out.println("\nEnter a number:");
                       //e=in.nextInt();
                       obj.Dqueue();;
                       break;    
              case 3:
                      obj.print_Queue();
                      break;
              
                      
               


           }
                   }while(ch!=0);

 }


}
