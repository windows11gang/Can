package demoloops;

public class Swaptwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x = 20;
  int y = 10;
  
  System.out.println("before swaping value");
  System.out.println("value of x is : "+ x);
  System.out.println("value of y is :" + y);
  
  // to swap the integer value 
  x = x+y; //20+10=30 given values 
  //after subtration the int values 
  y = x-y; //30-10=20 
  x = x-y; //30-20=10 
  
  
  System.out.println("After swaping value");
  System.out.println("value of x is :"+x);
  System.out.println("value of y is :"+y);
  
	}

}
