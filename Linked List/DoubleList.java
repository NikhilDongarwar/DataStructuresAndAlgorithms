import java.util.Scanner;

class DNode{
	
	int data;
	DNode right,left;
	DNode(int e){
		data=e;
		right=left=null;
	}
}
public class DoubleList {
	
	DNode root;
	void createList() {
		
		root=null;
	}
	void insert_left(int e) {
		DNode n=new DNode(e);
		
		if(root==null) {
			root=n;
				
		}
		else {
			
			root.left=n;
			n.right=root;
			root=n;
			
		}
	}
	void insert_right(int e)
    {   DNode n=new DNode(e);
        if(root==null)
            root=n;
        else
        {
           DNode t=root;//1
           while(t.right!=null)//2
               t=t.right;
           t.right=n;
           n.left=t;//3
        }
        System.out.println("Inserted");       
    }
	void delete_left()
    {
        if(root==null)
            System.out.println("Empty List");       
        else
        {
          DNode t=root;//1
          root=root.right;//2
          root.left=null;
          System.out.println(t.data+" deleted");       
        }
    }
	void delete_right()
    {   if(root==null)
            System.out.println("Empty List");       
        else
        {
          DNode t=root;//1
          DNode t2=root;//1
          while(t.right!=null)//2
          {t2=t;t=t.right; }
          if(root==t)//only one DNode
              root=null;//manual reset
          else
             t2.right=null;//3 derefrence the t node
          System.out.println(t.data+" deleted");       
         }
    }
	void print_list()
	{  if(root==null)
	            System.out.println("Empty List");       
	   else
	   {
	       DNode t=root;
	       while(t!=null)
	       {
	           System.out.print("| "+t.data+" |->");
	           t=t.right;
	       }
	   }   
	}
	void print_list_reverse()
	{  if(root==null)
	            System.out.println("Empty List");       
	   else
	   {
	       DNode t=root;
	       while(t.right!=null)
	       {
	           
	           t=t.right;
	       }
	       while(t!=null) {
	    	   
	    	   System.out.print(" <-| "+t.data+" |->");
	    	   t=t.left;

	       }
	   }   
	}
	
	public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        DoubleList obj=new DoubleList();
        obj.createList();
        int ch;
        do
        {
          System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Print List in Reverse\n0.Exit\n:");
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
              case 6:
            	  System.out.println("\nelements in list:");
            	  obj.print_list_reverse();
                  break;             
              case 5:
                  System.out.println("\nelements in list:");
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
