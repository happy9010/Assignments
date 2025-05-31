package Assignments;

public class Assignment6_ConditionalStatement {
	
	
	

	


	public static void main(String[] args) 
	
	{
		String customerName = " John Doe ";
		int creditScore = 720;
		float income = 55000.0f;
	Boolean	isEmployeed = true;
	 float debtToIncomeRatio = 35.0f;
		
       System.out.println("customer name is :" + customerName);
		if (creditScore>720)
		{
			System.out.println("loan is approved");
			
		}
		else if(creditScore<= 720 && creditScore >=650)
		{
			System.out.println(" Additional information required");
		}
		
			if (income >=50000.0)
			{
				System.out.println(" your income is eligible for loan");
			}
			else
			{
				
				System.out.println(" your income is not qualified to apply loan");
			}
		
				 if (isEmployeed==true)
				{
					System.out.println(" DTI ratio required for loan application");
				}
				 else 
				 {
					 
		 System.out.println(" Sorry you are not employeed , you are not eligible to apply for loan");
				 }
		
					 if(debtToIncomeRatio < 40)
					{
						System.out.println(" your DTI ratio is less than 40 percent ");
						System.out.println(" you are eligible to apply for loan");
						
					}
					else 
					{
						System.out.println("  your DTI ratio is greater than 40 percent , your loan is denied");
					}
					
				
			
				
	
		
		

		/*  
		 * A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
o If the credit score is above 750, the loan is automatically approved.
o If the credit score is between 650 and 750, additional checks are performed.
o If the credit score is below 650, the loan is denied.
2. Income:
o For credit scores between 650 and 750, the customer’s income must be at least $50,000
for the loan to be considered.

3. Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied.
...............................................
		  Now based on below details, print whether user is eligible to get the loan or not
customerName = "John Doe";
creditScore = 720;
income = 55000.0;
isEmployed = true;
debtToIncomeRatio = 35.0;
...................................................		
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
