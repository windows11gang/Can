package demoloops;

import java.util.Arrays;

public class Arrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] array1 = { 2715,2016,2017,2018,2019,2020
				
		};
		
		String[] array2= {"sachin","hitman","messi","ronaldo","suilchethri"
	};
		
		System.out.println("Original numeric array :"+ Arrays.toString(array1));
		Arrays.sort(array1);
        System.out.println("Sorted numeric array :"+Arrays.toString(array1));
        
        
        System.out.println("Original string array :"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array :"+Arrays.toString(array2));
        
	}     
}
	
