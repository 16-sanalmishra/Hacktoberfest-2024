// Java program for the above approach 
import java.lang.Math; 

class GFG{ 
	
// Function to check if N is a 
// decagonal number 
public static boolean isdecagonal(int N) 
{ 
	double n = (3 + Math.sqrt(16 * N + 9)) / 8; 
	
	// Condition to check if the 
	// number is a decagonal number 
	return (n - (int)n) == 0; 
} 

// Driver code	 
public static void main(String[] args) 
{ 
		
	// Given number 
	int N = 10; 
	
	// Function call 
	if (isdecagonal(N)) 
	{ 
		System.out.println("Yes"); 
	} 
	else
	{ 
		System.out.println("No"); 
	} 
} 
} 

// This code is contributed by divyeshrabadiya07	 
