package Assignments;

public class Assignment16_UpperandLowercaseString {

	public static void main(String[] args) {
		
	/* Assignment: Write a program to perform the following tasks:
1. Count the total number of words in the sentence.
2. Print the sentence words in reverse order.
3. Convert the first character of each word to uppercase and print original sentence

String sentence = "Java programming is fun and challenging";  */
		
		
		
		
String sentence = "Java programming is fun and challenging";
        
        // 1. Count words
        String[] words = sentence.split(" ");
        System.out.println("Total words: " + words.length);

        // 2. Print words in reverse order
        System.out.print("Reversed order: ");
        for (int i = words.length - 1; i >= 0; i--) {
        	System.out.print(words[i]);
           if (i > 0) {
               System.out.print(" ");
            }
        }
        System.out.println();

        // 3. Capitalize first character of each word and print original sentence
        StringBuilder capitalized = new StringBuilder();
        for (String w : words) {
            capitalized
                .append(Character.toUpperCase(w.charAt(0)))
                .append(w.substring(1))
                .append(" ");
        }
        System.out.println("Capitalized: " + capitalized.toString().trim());
		

	}

}
