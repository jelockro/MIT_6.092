package marathon;

import java.util.Arrays;

class Marathon {
	public static void main (String[] arguments) {
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
				"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
				"Aaron", "Kate"
		};
 
		int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
				343, 317, 265
		};

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		
		//finding lowest value without sort
		int i = 0;
		int bestTime = times[0];
		
		while (i < times.length) {
			
			if (times[i] < bestTime) {
				
				bestTime = times[i];
			}
			i++;
			
		}
		//System.out.println(bestTime);
		
		//finding index of times that corresponds with the lowest time, going to duplicate code
		
		int j = 0;
		while (j < times.length) {
						
			if (times[j] == bestTime) {
				
				System.out.println("The fastest runner is: " + names[j]);
				break;
			}
			j++;
			
		}
		
		/* finding the second lowest
		I get that this is not object-oriented coding, and it's not DRY but the assignment is about syntax
		in order to make it dry, I would make a method to iterate through the times array to find an index
		
		*
		*/
		
		int k = 0;
		int secondBest = times[0];
		while (k < times.length) {
			if ((times[k] < secondBest) && times[k] != bestTime) {
					
				secondBest = times[k];
				
			}
			k++;
						
		}
		
		int q = 0;
		while (q < times.length) {
						
			if (times[q] == secondBest) {
				
				System.out.println("The Second fastest runner is: " + names[q]);
				break;
			}
			q++;
			
		}
		
		
		
		
			
			
			
			
		
	}
}