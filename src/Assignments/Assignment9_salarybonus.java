package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_salarybonus {

	public static void main(String[] args) {
		String[][] employees = {
	            {"Alice Johnson", "75000.0", "5.1", "4.2"},
	            {"Bob Smith", "68000.0", "3.2", "3.8"},
	            {"Carol Davis", "82000.0", "7.1", "4.5"},
	            {"David Brown", "90000.0", "10.2", "2.5"},
	            {"Eva Green", "60000.0", "2.4", "3.5"}
	        };

	        Map<String, Double> hikePercentages = new HashMap<>();

	        for (String[] emp : employees) {
	            String name = emp[0];
	            double baseSalary = Double.parseDouble(emp[1]);
	            double experience = Double.parseDouble(emp[2]);
	            double rating = Double.parseDouble(emp[3]);

	            double variablePayPercent = 0.0;
	            double bonus = 0.0;

	            if (rating >= 4.0) {
	                variablePayPercent = 15.0;
	                bonus = 1500;
	            } else if (rating >= 3.0) {
	                variablePayPercent = 10.0;
	                bonus = 1200;
	            } else {
	                variablePayPercent = 3.0;
	                bonus = 300;
	            }

	            double reward = experience >= 5.0 ? 5000 : 0;

	            double hike = (baseSalary * variablePayPercent / 100.0) + bonus + reward;
	            double hikePercentage = (hike / baseSalary) * 100.0;

	            hikePercentages.put(name, hikePercentage);
	        }

	        
	        for (String name : hikePercentages.keySet()) {
	            double hike = hikePercentages.get(name);
	            System.out.printf("%s: %.2f%% hike%n", name, hike);
	        
	        }
	    }
	

	}


