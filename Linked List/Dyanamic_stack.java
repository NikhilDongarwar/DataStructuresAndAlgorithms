import java.util.Scanner;

/*class Node{
	
	int data;
	Node next; //self reference
	Node(int data){
		this.data=data;
		this.next=null; // address of other node
	}
}*/


public class Dyanamic_stack {
	
Node tos;
LinearLinkedList li=new LinearLinkedList();

    
    void createList()
    {
        tos=null;//tos is never created but assigned as per need
        //the 1st node is called tos
    }
    
    void push(int e)
    {
    	li.insert_left(e);
               
    	
    	System.out.println("Pushed");       
    }
    void pop()
    {
        li.delete_left();
         
        
    }
    void peek() {
    	
    	if(li.root==null)
    		System.out.println("Empty");
    	else
    		System.out.println(li.root.data);
    }
    
    void print_stack()
    {  
    	li.print_list();
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Dyanamic_stack obj=new Dyanamic_stack();
        obj.createList();
        int ch;
        do
        {
          System.out.println("\n1.Push\n2.Pop\n3.Print_all\n4.Peek");
          ch=in.nextInt();//read
          switch(ch)
          {
              case 1:
                      System.out.println("\nEnter a number:");
                      int e=in.nextInt();
                      obj.push(e);
                      break;
              case 2:
                      //System.out.println("\nEnter a number:");
                      //e=in.nextInt();
                      obj.pop();;
                      break;    
             case 3:
                     obj.print_stack();
                     break;
             case 4:
                 obj.peek();
                 break;         
                     
              


          }
                  }while(ch!=0);

}
}
        
