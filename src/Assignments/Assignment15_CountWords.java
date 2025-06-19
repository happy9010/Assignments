package Assignments;

public class Assignment15_CountWords {

	public static void main(String[] args) {
	
		
		/* Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
indexes.
1. Divide into multiple words
2. Find total number of occurrences
3. Print count and Indexes of the word

String paragraph = "Java is a popular programming language. Java is used for web
development, mobile applications, and more.";   */
		
		
	String paragraph = 	"Java is a popular programming language. Java is used for web development, mobile applications, and more.";
			 
		String [] words = paragraph.split(" ");
		
		int count = 0;
		for (int i = 0; i<=words.length-1;i++) {
			String word = words[i].replaceAll("[^a-zA-Z]", ".");
			if(word.equalsIgnoreCase("Java"))
			{
				System.out.println("Java word is present in Array with index:" +i);
				count++;
			
			}
		}
			
		System.out.println("Total number of Java words in paragraph are:" +count);
		

	}

}
