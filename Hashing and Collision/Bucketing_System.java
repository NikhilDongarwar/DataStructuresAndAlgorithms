package hash_function;

import java.util.Scanner;

public class Bucketing_System {
	int[][]hashtable;
	int Maxsize,count;
	void init(int size) 
	{
		Maxsize=size;
        hashtable=new int[Maxsize][Maxsize];
        count=0;
        for(int i=0;i<hashtable.length;i++) {
            for(int j=0;j<hashtable.length;j++)
            	hashtable[i][j]=-1;
        }   
            	
	
	}
	void printHash()
    {
        for(int i=0;i<hashtable.length;i++)
        {   for(int j=0;j<hashtable.length;j++)
        	   System.out.print("@ "+i+j+"----->"+hashtable[i][j]+"\t");
            System.out.println(); 
        }
        
          
    }
    boolean isFull()
    {
        if(count==Maxsize)
           return true;
        else
            return false;
    }
    boolean isEmpty()
    {
        if(count==0)
           return true;
        else
            return false;
    }
    void insert(int data)
    {
    	int index=data%Maxsize;
    	System.out.println("index is "+index);
    	for(int i=0;i<hashtable.length;i++) {
    		
    		if(hashtable[index][i]==-1)
    		{
    			hashtable[index][i]=data;
    			System.out.println("inserted at "+i+index); 
                count++;
                break;
    		}
    		
    	  
    	}
    }
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        Bucketing_System obj=new Bucketing_System();
        obj.init(4);
        do
        {
            System.out.println("1.Insert in:\n2.Print Hash Table\n0.Exit");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(obj.isFull())
                        System.out.println("Hash Table is Full");
                    else
                    {
                        System.out.println("Enter data to hash:");
                         int data=in.nextInt();
                         obj.insert(data);
                    }
                    break;
                    case 2:
                    if(obj.isEmpty())
                        System.out.println("Hash Table is Empty");
                    else
                    {
                        System.out.println("Data in hash:");
                        obj.printHash();
                    }
                    break;
                    case 0:
                        System.out.println("Exiting....tata");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
            }
            
        }  while(ch!=0);
    }


	
}
