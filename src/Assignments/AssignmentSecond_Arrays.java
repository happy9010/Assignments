package Assignments;

public class AssignmentSecond_Arrays {

	public static void main(String[] args) {
		
		
		 String[][][] subjects = {
		            {
		                {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
		                {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
		            },
		            {
		                {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
		                {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
		            },
		            {
		                {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
		                {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
		            },
		            {
		                {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
		                {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
		            },
		            {
		                {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
		                {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}
		            }
		        };

		        
		        System.out.println("Semester 2, Subject 4: " + subjects[1][0][3]);
		        System.out.println("Semester 2, Subject 5: " + subjects[1][0][4]);

		        
		        System.out.println("Semester 4, Subject 3 Status: " + subjects[3][1][2]);
		        System.out.println("Semester 4, Subject 6 Status: " + subjects[3][1][5]);
		    }
		
		

	}


