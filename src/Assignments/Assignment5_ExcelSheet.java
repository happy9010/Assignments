package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_ExcelSheet {

	public static void main(String[] args) {
		
		
		
		//student1data
		
		Map<String, String> studentdata1 = new HashMap<>();
		studentdata1.put("Name", "John Doe");
		studentdata1.put("Age", "Twenty");
		studentdata1.put("Gender", "Male");
		studentdata1.put("Roll Number", "SBA12345");
		studentdata1.put("Grade", "A++");
		studentdata1.put("Major", "Computer Science");
		studentdata1.put("GPA", "A3.8");
		studentdata1.put("Email", "john@example.com");
		studentdata1.put("PAN Number", "SDF6543210");
		studentdata1.put("Address", "123 Elm St");

		//student2data
		Map<String, String> studentdata2 = new HashMap<>();
		studentdata2.put("Name", "Jane Smith");
		studentdata2.put("Age", "Twenty One");
		studentdata2.put("Gender", "Female");
		studentdata2.put("Roll Number", "SBA12346");
		studentdata2.put("Grade", "B+");
		studentdata2.put("Major", "Mathematics");
		studentdata2.put("GPA", "A3.5");
		studentdata2.put("Email", "jane@example.com");
		studentdata2.put("PAN Number", "REW6543211");
		studentdata2.put("Address", "456 Oak St");
        // student3data
		Map<String, String> studentdata3 = new HashMap<>();
		studentdata3.put("Name", "Mike Brown");
		studentdata3.put("Age", "Twenty Two");
		studentdata3.put("Gender", "Male");
		studentdata3.put("Roll Number", "SBA12347");
		studentdata3.put("Grade", "A+");
		studentdata3.put("Major", "Physics");
		studentdata3.put("GPA", "A3.9");
		studentdata3.put("Email", "mike@example.com");
		studentdata3.put("PAN Number", "TYR6543212");
		studentdata3.put("Address", "789 Pine St");

		List<Map<String, String>> studentList = new ArrayList<>();
		studentList.add(studentdata1);
		studentList.add(studentdata2);
		studentList.add(studentdata3);

		// Employeedata
		Map<String, String> empdata1 = new HashMap<>();
		empdata1.put("Employee ID", "E001");
		empdata1.put("Name", "Alice Green");
		empdata1.put("Age", "Thirty");
		empdata1.put("Gender", "Female");
		empdata1.put("Department", "Engineering");
		empdata1.put("Position", "Software Engineer");
		empdata1.put("Salary", "75K Pounds");
		empdata1.put("Email", "alice@example.com");
		empdata1.put("PAN Number", "SDF6543210");

		Map<String, String> empdata2 = new HashMap<>();
		empdata2.put("Employee ID", "E002");
		empdata2.put("Name", "Bob Johnson");
		empdata2.put("Age", "Thirty Five");
		empdata2.put("Gender", "Male");
		empdata2.put("Department", "Marketing");
		empdata2.put("Position", "Marketing Manager");
		empdata2.put("Salary", "85K Pounds");
		empdata2.put("Email", "bob@example.com");
		empdata2.put("PAN Number", "REW6543211");

		Map<String, String> empdata3 = new HashMap<>();
		empdata3.put("Employee ID", "E003");
		empdata3.put("Name", "Carol White");
		empdata3.put("Age", "Twenty Eight");
		empdata3.put("Gender", "Female");
		empdata3.put("Department", "Sales");
		empdata3.put("Position", "Sales Executive");
		empdata3.put("Salary", "65K Pounds");
		empdata3.put("Email", "carol@example.com");
		empdata3.put("PAN Number", "TYR6543212");

		List<Map<String, String>> empList = new ArrayList<>();
		empList.add(empdata1);
		empList.add(empdata2);
		empList.add(empdata3);

		// product details
		Map<String, String> product1 = new HashMap<>();
		product1.put("Product ID", "P001");
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12K Pounds");
		product1.put("Stock Quantity", "Not Available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 years");
		product1.put("Rating", "4.5 Stars");
		product1.put("Manufacturing Date", "Aug 2023");
		product1.put("Expiry Date", "Aug 2028");

		Map<String, String> product2 = new HashMap<>();
		product2.put("Product ID", "P002");
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "150K Pounds");
		product2.put("Stock Quantity", "Two");
		product2.put("Supplier", "Office Depot");
		product2.put("Warranty", "1 year");
		product2.put("Rating", "4 Stars");
		product2.put("Manufacturing Date", "Sep 2024");
		product2.put("Expiry Date", "N/A");

		Map<String, String> product3 = new HashMap<>();
		product3.put("Product ID", "P003");
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75 Pounds");
		product3.put("Stock Quantity", "Two Hundred");
		product3.put("Supplier", "KitchenWorld");
		product3.put("Warranty", "6 months");
		product3.put("Rating", "4.2 Stars");
		product3.put("Manufacturing Date", "Jan 2025");
		product3.put("Expiry Date", "Jan 2027");

		List<Map<String, String>> productList = new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);

		// --- Map of Student, Employee and Product Data ---
		Map<String, List<Map<String, String>>> data = new HashMap<>();
		data.put("Students", studentList);
		data.put("Employees", empList);
		data.put("Products", productList);

		// Print the supplier details
		System.out.println(data.get("Products").get(1).get("Supplier"));
	}


	}


