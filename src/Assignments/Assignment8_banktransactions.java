package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment8_banktransactions {

	public static void main(String[] args) {
		
		
		int creditCount = 0;
        int debitCount = 0;
        int totalCredit = 0;
        int totalDebit = 0;
        int suspiciousCount = 0;
		
		
		List<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);
        
        for (int amount : transactions) {
            if (amount > 0) {
                creditCount++;
                totalCredit += amount;
                if (amount > 10000) {
                    System.out.println("Suspicious credit transaction with amount: " + amount);
                    suspiciousCount++;
                }
            } else if (amount < 0) {
                debitCount++;
                totalDebit += Math.abs(amount);
                if (Math.abs(amount) > 10000) {
                    System.out.println("Suspicious debit transaction with amount: " + Math.abs(amount));
                    suspiciousCount++;
                }
            }
        }
        
        int finalBalance = totalCredit - totalDebit;

        // Output the results
        System.out.println("\n--- Transaction Summary ---");
        System.out.println("Total credit transactions: " + creditCount);
        System.out.println("Total debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + totalCredit);
        System.out.println("Total amount debited: " + totalDebit);
        System.out.println("Final account balance: " + finalBalance);
        System.out.println("Total suspicious transactions: " + suspiciousCount);
    }
		 
	
}
