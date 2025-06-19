package Assignments;

public class Assignment17_powerof {
	
	
	public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            // Handle negative exponents if needed (e.g., return 1.0 / calculatePower(base, -exponent))
            // For simplicity, this example assumes non-negative exponents for integer results.
            throw new IllegalArgumentException("Exponent must be non-negative for this implementation.");
        }
        
        double result = 1; // Initialize result to 1, as any number to the power of 0 is 1

        for (int i = 0; i < exponent; i++) {
            result *= base; // Multiply result by base for 'exponent' number of times
        }
        return result;
    }

	
	
	
	

	public static void main(String[] args) {
		
		  double base = 2.0000;
	        int exponent = 10;
	        double powerResult = calculatePower(base, exponent);
	        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult); // Output: 32

	       
		
	}

}
