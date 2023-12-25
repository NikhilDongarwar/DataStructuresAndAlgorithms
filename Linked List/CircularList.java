import java.util.Scanner;

/**
 *
 * @author amart
 */
public class CircularList 
{
    Node root,last;
    
    void createList()
    {
        root=null;
        last=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    
    void insert_left(int e)
    {
        Node n=new Node(e);
        if(root==null) {
        	root=last=n;
        	

        }
           
       else
        {    //Node t=root;
            n.next=root;//1
            root=n;
            last.next=root;
            
        }
        System.out.println("Inserted");       
    }
    void insert_right(int e)
    {   Node n=new Node(e);
    if(root==null) {
    	root=last=n;
    	

    }
     else
        {
           last.next=n;
           last=n;
           last.next=root;
           
        
        }
        System.out.println("Inserted");       
    }
     void delete_left()
    {
        if(root==null)
            System.out.println("Empty List");       
        else
        {
        	Node t=root;

        	if(root==last) {
        		root=null;
        	}
        	else {	
             root=root.next;
             last.next=root;
             System.out.println(t.data+" deleted");
        	}
          
        }
    }
    void delete_right()
    {   if(root==null)
            System.out.println("Empty List");       
        else
        {
          Node t=root;//1
          Node t2=root;//1
          while(t!=last)//2
          {t2=t;t=t.next; }
          if(root==last)//only one node
              root=last=null;//manual reset
          else
          {
        	 last=t2; 
             last.next=root;//3
          }
          System.out.println(t.data+" deleted");       
         }
    }
    
void print_list()
{  if(root==null)
            System.out.println("Empty List");       
   else
   {
       Node t=root;
       do {
    	   //System.out.println();
    	   System.out.print("| "+t.data+" |->");
    	   t=t.next;
    	   

       }
       while(t!=root);
      
         
   }   
}



      
   public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         CircularList obj=new CircularList();
         obj.createList();
         int ch;
         do
         {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int e=in.nextInt();
                       obj.insert_left(e);
                       break;
               case 2:
                       System.out.println("\nEnter a number:");
                       e=in.nextInt();
                       obj.insert_right(e);
                       break;    case 3:
                      obj.delete_left();
                      break;
               case 4:
                      obj.delete_right();
                      break;
               case 5:
            	   obj.print_list();
            	   break;
               case 0:
                       System.out.println("Exiting");
                   break;
               default:
                       System.out.println("Wrong Choice");
                   break;
           }
             
         }while(ch!=0);
     }
      
}