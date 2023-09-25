package demoloops;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number =1234567;
       int reverse = 0;
       while (number != 0)
       
       {
    	   int remainder = number % 10;
    	   reverse = reverse*10+remainder;
    	   number = number/10;
    	   
       }
       
       System.out.println("Reverse the give number is:"+ reverse);
     
    }
	}


