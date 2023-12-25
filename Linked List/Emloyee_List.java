import java.util.Scanner;

class Employee{
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return Salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		Salary = salary;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	int id;
	String name;
	Double Salary;
	String Gender;
	Employee next;
	public Employee(int id, String name, Double salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Gender = gender;
		next = null;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", Gender=" + Gender + "]";
	}
	
	
}
public class Emloyee_List 
{
   Employee root;
    
    void createList()
    {
        root=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    
    void insert_left(Employee e)
    {
        Employee n=e;
        if(root==null)
            root=n;
        else
        {
            n.next=root;//1
            root=n;//2
        }
        System.out.println("Inserted");       
    }
    void insert_right(Employee e)
    {   
    	Employee n=e;
        if(root==null)
            root=n;
        else
        {
           Employee t=root;//1
           while(t.next!=null)//2
               t=t.next;
           t.next=n;//3
        }
        System.out.println("Inserted");       
    }
   /*  void delete_left()
    {
        if(root==null)
            System.out.println("Empty List");       
        else
        {
          Employee t=root;//1
          root=root.next;//2
          System.out.println(t+" deleted");       
        }
    }
    void delete_right()
    {   if(root==null)
            System.out.println("Empty List");       
        else
        {
          Employee t=root;//1
          Employee t2=root;//1
          while(t.next!=null)//2
          {t2=t;t=t.next; }
          if(root==t)//only one node
              root=null;//manual reset
          else
             t2.next=null;//3
          System.out.println(t+" deleted");       
         }
    }*/
    
void print_list()
{  if(root==null)
            System.out.println("Empty List");       
   else
   {
       Employee t=root;
       while(t!=null)
       {
           System.out.print("| "+t+" |->");
           t=t.next;
       }
   }   
}

//void search_list(int k) {
//
//
//if(root==null)
//	   System.out.println("List Empty");
//else {
//	   
//	  Node t=root;
//	  while(t!=null) {
//		  
//		  if(k==t.data)
//			  System.out.println(k+" key found");
//		  
//		  t=t.next;
//			 
//	  }
//	  if(t==null) {
//		  System.out.println(k+" key not found");
//	  }
//}
//}
void search(int id)
{  if(root==null)
            System.out.println("Empty List");       
   else
   {   Employee t=root;
       while(t!=null && id!=t.id)
         t=t.next;
       
       if(t==null)
               System.out.println(id+" not found in list");
       else
               System.out.println(t.toString()+" found in list");
   }
    

}

void deleteKey(int id)
{  if(root==null)
            System.out.println("Empty List");       
   else//not empty
   {   
       Employee t=root;Employee t2=root;
       while(t!=null && id!=t.id)
       {
        t2=t;       
        t=t.next;
       }
       if(t==null)//not found
               System.out.println(id+" not found in list");
       else//found
       {
           System.out.println(id+" found in list");
           if(t==root)//case1:left most
            root=root.next;
           else if(t.next==null)//case 2:right most
             t2.next=null;
           else//case 3:in between
             t2.next=t.next;
           System.out.println(t+" deleted");     
       }
           
    }
   
		
	
}
private void update_Details(int id, Employee t)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter choice : 1.Update Name \n 2.Update Salary 3.Update Gender");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("Enter Name to update");
		t.setName(sc.next());
		break;
	case 2:
		System.out.println("Enter salary to update");
		t.setSalary(sc.nextDouble());
		break;
	case 3:
		System.out.println("Enter Gender to update:");
		t.setGender(sc.next());
		break;
	default:
		System.out.println("Invalid choice");
	}		
}
void Update(int id)
{
	if(root==null)
	{
		System.out.println("Empty list");
	}
	else
	{
		Employee t=root;
		while(t!=null)
		{
			int num=t.getId();
			if(id==num)
			{
				System.out.println("Details Found"+t);
				
			}
			else
			{
				t=t.next;
			}
			break;
			
		}
		if(t==null)
		{
			System.out.println("Details not found");
		}
		else
			update_Details(id, t);
	}
	
}
    


      
   public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         Emloyee_List obj=new Emloyee_List();
         obj.createList();
         int ch;
         do
         {
           System.out.println("\n1.Register Left\n2.Register Right\n3.Search\n4.Delete\n5.Print List\n6.Update\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nRegister Employee:");
                       System.out.println("\nId,name,salary,gender");
                       int id=in.nextInt();
                       String name=in.next();
                       Double Sal=in.nextDouble();
                       String gender=in.next();

                       Employee e=new Employee(id,name,Sal,gender);
                       obj.insert_left(e);
                       break;
               case 2:
            	   System.out.println("\nRegister Employee:");
                   System.out.println("\nId,name,salary,gender");
                   int id1=in.nextInt();
                   String name1=in.next();
                   Double Sal1=in.nextDouble();
                   String gender1=in.next();

                   Employee e1=new Employee(id1,name1,Sal1,gender1);
                   obj.insert_right(e1);
                   break;              
                case 3:
                	System.out.println("\nEnter a id to search:");
                	  int tosearch=in.nextInt();
                      obj.search(tosearch);
                      break;
               case 4:
            	   System.out.println("\nEnter a id to Delete:");
             	  int todel=in.nextInt();
             	  obj.deleteKey(todel);
                       
               case 5:
                   System.out.println("\nEmployees  in list:");
                   obj.print_list();
                   break;
               case 6:
            	  System.out.println("\nEnter a id to Update:");
              	  int toup=in.nextInt();
              	  obj.Update(toup);
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
