package demoloops;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int m1 = 0 , m2 = 1, sum = 0;
          System.out.println(m1+"  "+m2);
          
          for(int i=2;i<30;i++) {
        	  
        	  sum=m1+m2;
        	  System.out.println("  "+sum);
        	  m1=m2;
        	  m2=sum;
          }
	}
}
