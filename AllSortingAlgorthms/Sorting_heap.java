public class Sorting_Algorithms 
{
    void print_array(int a[])
    {
         System.out.println("\narray has");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
    }
    void HeapSort(int a[])
    {
        int i,j,t,pc;//pc:parent and child ref
        boolean done;
        for(i=a.length-1;i>=0;i--)//bottom to top
        {
            for(j=0;j<=i;j++)//inbetween sort
            {
                pc=j;
                done=true;
                while(pc>=0 && pc/2>=0 && done!=false)//parent child compare for maxheap
                {
                    if(a[pc]>a[pc/2])//child is greater than parent swap
                    {
                        t=a[pc];
                        a[pc]=a[pc/2];
                        a[pc/2]=t;
                        pc=pc/2;//go to parent and compare with its parent
                    }
                    else
                        done=false;
                }
            }
          //swap root with last in the pass  
          t=a[i];
          a[i]=a[0];
          a[0]=t;
        }
    }
