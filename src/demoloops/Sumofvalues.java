package demoloops;

public class Sumofvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring array and initialize it with values
  int array[] = {11,12,13,14,15,16,17,18,19,20};
  //initialing sum variable with 0
  int sum = 0;
  //add array elements
  for (int i=0; i<array.length; i++) {
	  sum += array[i];   // sum = sum + array[i]
	  
  }
    System.out.println("sum of array elements="+sum);
  
  
	}

}
