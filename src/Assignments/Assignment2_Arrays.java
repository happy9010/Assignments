package Assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		String sem1subjects[]= { "MathematicsI"," Physics", " Chemistry", "Computer programming"," Engineering Drawing"," Basics Electrical Engg"};
		String sem1marks[]= { " Pass(78)", " Pass(85)"," Fail(21)"," Pass(74)", "Pass(88)", " Pass(79)"}; 
		String sem2subjects[]= {"Mathematics II ", " Mechanics", " Environmental Sci. ", "Basic Electronics"," Engineering Physics" ," Engineering Graphics"};
				
		String sem2marks[]= { "Pass(82) "," Pass(77) ", "Pass(93) ","Fail(19) "," Fail(24)","Pass(90) "};
		String sem3subjects[]= { "Data Structures ","Discrete Mathematics",  "Digital Electronic" ,"Operating Systems " ,  " Signals and Systems"," OOPs"};
			
				
		String sem3marks[]= {"Pass(88)" ,"Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"  };
		String sem4subjects[]= { " Algorithms"  , "Computer Networks  " , " Database Systems"," Microprocessors" ," Communication Eng." , " Software Engineering"};
		String sem4marks[]= {"Pass(91)" ,"Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"};
		String sem5subjects[]= {"Probability &Stats"  , "Machine Learning  " , " Complier Design"," Theory of Computation" ," Embedded Systems" , " Computer Graphics"};
		String sem5marks[]= {"Pass(86)" ,"Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"};
		
		String[] [] sem1data = { sem1subjects, sem1marks };
		String[] [] sem2data = {sem2subjects, sem2marks};
		String [] [] sem3data= { sem3subjects, sem3marks};
		String [] [] sem4data = { sem4subjects, sem4marks };
		String [] [] sem5data = { sem5subjects, sem5marks };
		
		String [] [] [] studata = { sem1data , sem2data, sem3data,sem4data,sem5data };
		
		
		System.out.println(studata[1][0]);
		
			
		

	}

}
