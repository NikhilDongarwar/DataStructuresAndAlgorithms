import java.util.Scanner;

public class Oueue_using_stack {
	
int stack[],tos,MaxSize;
    
    void createQueue(int size)
    {
        stack=new int[size];
        MaxSize=size;
        tos=-1;
    }
    void Enqueue(int e)
    {
        tos++;
        stack[tos]=e;
        //or stack[++tos]=e;
    }
    int Dequeue()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }
        
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
     boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
     void print_queue()
     {
         for(int i=tos;i>-1;i--)
             System.out.println(stack[i]);
     }
     

    public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter size of queue:");
         int size=in.nextInt();
         Oueue_using_stack obj=new Oueue_using_stack ();
         obj.createQueue(size); 
         Oueue_using_stack temp=new Oueue_using_stack();
         temp.createQueue(size);
         int ch;
         do
         {
           System.out.println("\n1.Enqueue\n2.Dequeue\n0.Exit\n 4.print");
           ch=in.nextInt();//read
           
           switch(ch)
           {
               case 1:
                   if(!obj.is_full())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.Enqueue(no);
                       System.out.println("Enqueue "+no);
                   }
                   else
                       System.out.println("Queue is Full");
                   break;
               case 2:
                    while(!obj.is_empty())
                   {
                       int rs=obj.Dequeue();
                       temp.Enqueue(rs);
                       
                   }
                   System.out.println("Front  element of queue is:"+temp.Dequeue());
                   
                   break;
               case 4:
                   if(!temp.is_empty())
                  {
                      System.out.println("Elements on Queue are");
                      temp.print_queue();
                  }
                   else
                      System.out.println("Queue is Empty");
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
