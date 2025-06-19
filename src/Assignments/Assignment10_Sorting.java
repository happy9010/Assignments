package Assignments;

import java.util.Arrays;

public class Assignment10_Sorting {

	public static void main(String[] args) {
		
		
		/*Given values are 12 ,34,11,36,87,98,93.
		Store the values in Array and Print second and third largest number from the above values without
		using collections and default sort methods */
		
		int temp = 0;
		
		int a []= {12,34,11,36,87,98,93};
		
		for (int i=0 ; i<a.length;i++)
		{
			
			for (int j = i+1;j<a.length;j++)
			{
				if (a[j]>a[i])
				{
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}		
		}
		// Print sorted array
        System.out.print("Sorted array (descending): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // for newline

        // Print second and third largest
        System.out.println("Second largest: " + a[1]);
        System.out.println("Third largest: " + a[2]);
		
	    
	}

}
