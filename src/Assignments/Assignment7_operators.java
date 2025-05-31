package Assignments;

public class Assignment7_operators {

	public static void main(String[] args) {
		
		
		/*   1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students

Expected Output:
Updated Marks:
Suresh: 85
Mahesh: 90
Naresh: 92
Average Marks: 89.0
		
		 */
		
		String stuNames[] = {"Suresh","Mahesh","Naresh"};
		int marks [] = {75, 80, 82 };
		int a =10;
		marks[0]+=a;
		marks[1]+=a;
		marks[2]+=a;
		float averageMarks = 0.0f;
		
		float updatedMarks [] = { marks[0],marks[1],marks[2]  };
		
		System.out.println(updatedMarks[0]);
		System.out.println(updatedMarks[1]);
		System.out.println(updatedMarks[2]);
		
		 averageMarks  =  (updatedMarks[0]+updatedMarks[1]+updatedMarks[2])/2;
		System.out.println(averageMarks);
		
		
	}

}
