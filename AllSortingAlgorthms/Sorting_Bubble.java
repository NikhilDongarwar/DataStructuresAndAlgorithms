public class Sorting_Algorithms 
{
    void print_array(int a[])
    {
         System.out.println("\narray has");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
    }
  void BubbleSort(int a[])
    {
        for(int i=0;i<a.length-1;i++)//passes
        {
            for(int j=0;j<a.length-1;j++)//sort
                    {
                        if(a[j]>a[j+1])
                        {
                            int t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t;
                        }
                    }
        }
    }
    void BubbleSort_V2(int a[])
    {
        for(int i=0;i<a.length-1;i++)//passes
        {
            for(int j=0;j<(a.length-1-i);j++)//sort
                    {
                        if(a[j]>a[j+1])
                        {
                            int t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t;
                        }
                    }
        }
    }
    void BubbleSort_V3(int a[])
    {
        boolean flag=true;
        for(int i=0;i<a.length-1;i++)//passes
        {
            flag=true;
            for(int j=0;j<(a.length-1-i);j++)//sort
                    {
                        if(a[j]>a[j+1])
                        {
                            flag=false;//means sorting needed
                            int t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t;
                        }
                    }//j loop
            if(flag==true)
            {
                 System.out.println("\nsorted and done ");
                 break;
            }
            else
            {
                 System.out.println("\npass:"+(i+1));
            }
        }
    }
public static void main(String args[])
    {
        int a[]={66,11,33,99,88,22,44,55,77};
        int b[]={22,11,44,33,55,66,77,88,99};
        Sorting_Algorithms obj=new Sorting_Algorithms();
        obj.print_array(a);
        obj.BubbleSort_V3(b);

        obj.print_array(a);
        
    }
}

