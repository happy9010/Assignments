package Assignments;

public class Assignment18_palidrome {

	public static void main(String[] args) {
		
	/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.  */
		
		
		
		String s = "race a car";
	String mod=	s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(mod);
	String	reverse = "";
		for (int i=mod.length()-1;i>=0;i--)
		{
			reverse = reverse +mod.charAt(i);
		}
		
		System.out.println(reverse);
		
		if(mod.equalsIgnoreCase(reverse)) {
			
			System.out.println("the given string is palindrome");
			
		}
		else
			{
				System.out.println("the given string is notpalindrome");
			}
		}

	}


