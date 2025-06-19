package Assignments;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
	
		String name = "Harpreet123@";
		
		 // how to reverse a string 
		int len = name.length();
		System.out.println(len);
		
	String 	rev = "";
	for (int i=name.length()-1; i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
System.out.println(rev);

       //  how to remove all the spaces inside a string 

String a= "G O D";
String newa = a.replace(" ", "");
System.out.println(newa);


       // remove all the numbers and characters from the string

String s = "Harpreet123@#$%";
String k = s.replaceAll("[a-zA-Z0-9]", "");
System.out.println(k);


       // remove all the special characters including spaces other than numbers and characters
String address = "22 Archway Trail,Brampton, Onatrio@#$%^";
String newaddress = address.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(newaddress);

      // How to access and print some part of the string 


System.out.println(address.substring(0,2));

      // convert into lowercase and uppercase


System.out.println(a.toLowerCase());
System.out.println(address.toUpperCase());

//  Extract part of string from dynamic text ===>> string.split(expression);
String [] splittedtext = address.split(" ");
for (int i= 0; i<=splittedtext.length-1;i++)
{
	
	System.out.println(splittedtext[i]);
}
//	System.out.println(Arrays.toString(splittedtext));
	/*System.out.println(splittedtext[0]);
	System.out.println(splittedtext[1]);
	System.out.println(splittedtext[2]);
	System.out.println(splittedtext[3]);  */
	
}

	}


