
  import java.util.Scanner;
   
  public class StackExample{ 
  char stack[];
   int
  tos,MaxSize; static boolean flag=true;
  
  void createStack(int size){ stack=new char[size]; MaxSize=size; tos=-1;
  
  
  
  
  } void push(char a){
  
  
  stack[++tos]=a; tos++; stack[tos]=a;
  
  
  } int pop(){
  
    int result=stack[tos]; 
     tos--; 
     return result;
  
   //return stack[tos--];
  
  }
  
  boolean is_full(){
  
  if(tos==MaxSize-1) return true; else return false;
  
  
  } boolean is_empty(){
  
  if(tos==-1) return true; else return false;
  
  
  }
  
 /**
	* 
	*/
		  void print_stack(){
		  
		  for(int i=tos;i>=0;i--){
		  
		  System.out.println(stack[i]); }
		  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  public static void main(String[] args) {
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter sequence to check"); String line=sc.next();
		  
		   char size=sc.next().charAt(0); StackExample obj=new StackExample();
		  obj.createStack(line.length());
		  
		  for(int i=0;i<line.length();i++) { char c=line.charAt(i); if(c=='{')
		  obj.push(c); else if(c=='}'){ if(!obj.is_empty()) obj.pop();
		  
		  else {
		  
		  System.out.println("} is unexpected"); flag=false; } } } if(!obj.is_empty())
		  System.out.println("} is expected"); else if(flag) {
		  System.out.println("perfectly balanced"); } } }
		 