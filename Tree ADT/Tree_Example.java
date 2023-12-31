
public class Tree_Example {
    DNode root;
    void createtree()
    {
        root=null;
    }
    
    void insert(DNode r,DNode n)//r:root n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
    }
    void inorder(DNode r)
    {
        if(r!=null)
        {
            inorder(r.left);//l
            System.out.print(r.data+",");//p
            inorder(r.right);//r
        }
        
    }
   boolean search(DNode r,int k) { // concept of binary search in tree , tree need to be binary tree
    	if(r!=null) {
    		 if(r.data==k)
    			 return true;
    		 else 
    			 {
    			 if(k<r.data)
    			     return search(r.left,k);
    		     else
    			   return search(r.right,k);
    		     //if function is returning , recursively call it using return
    			 }
    		
    	}
    	else 
    		return false;
    }


	void postorder(DNode r) {
		
		if(r!=null)
		{postorder(r.left);
		postorder(r.right);
		System.out.print(r.data+",");
		}
		
	}
	void preorder(DNode r) {
		if(r!=null) {
		System.out.print(r.data+",");
		preorder(r.left);
		preorder(r.right);
		}
		
		
	}
	int getHeight(DNode r)  //imp
	{
		if(r==null) {
			return 0;
		}
		else {
			int right=getHeight(r.right);
			int left=getHeight(r.left);
			return Math.max(left, right)+1;		}
	}
	boolean isBalanced(DNode r)  //imp
    {
        if(r==null)
            return true;
        else
        {
            int right=getHeight(r.right);
            int left=getHeight(r.left);
            if(Math.abs(left - right)<=1)//+1,0,-1
                return true;
            else
                return false;
            
        }
    }
	DNode deletion(DNode r,int key) {
		if(r==null)
			return r;
		else {
			
			if(key<r.data)
			{
				r.left=deletion(r.left,key);
			    return r;
			}
			else if(key>r.data) {
				r.right=deletion(r.right,key);
				  return r;}
			    
			else
				if(r.left==null)
					return r.right;
				else if(r.right==null)
					return r.left;
			    r.data=minValue(r.right);
			    r.right=deletion(r.right,r.data);
			
			
		}
		return r;
		
	}
	
        int minValue(DNode r) 
        {
		// TODO Auto-generated method stub
        	int min=r.data;
        	while(r.left!=null) {
        		min=r.left.data;
        		r=r.left;
        	}
        	return min;
        	
		
	}

	public static void main(String args[])
    {
        Tree_Example obj=new Tree_Example();
        obj.createtree();//root=null
        DNode n1=new DNode(50);
        obj.insert(obj.root, n1);
        DNode n2=new DNode(30);
        obj.insert(obj.root, n2);
        DNode n3=new DNode(20);
        obj.insert(obj.root, n3);
        DNode n4=new DNode(40);
        obj.insert(obj.root, n4);
        DNode n5=new DNode(70);
        obj.insert(obj.root, n5);
        DNode n6=new DNode(60);
        obj.insert(obj.root, n6);
     
        obj.inorder(obj.root);
        System.out.println(" ");

        /*obj.inorder(obj.root);
        System.out.println(" ");
        obj.preorder(obj.root);
        System.out.println(" ");
        obj.postorder(obj.root);
        System.out.println(" c`");
        System.out.println("Height is:"+(obj.getHeight(obj.root)-1));
        //obj.getBalance(obj.root);
        System.out.println("is it perfectly balanced: "+obj.isBalanced(obj.root));
        System.out.println(obj.search(obj.root, 200));*/
        DNode re=obj.deletion(obj.root,50);
        System.out.println(re.data);
        obj.inorder(obj.root);
        
        

        
    }


}
