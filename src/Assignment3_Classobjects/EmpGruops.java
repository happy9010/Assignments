package Assignment3_Classobjects;


public class EmpGruops extends Employees
{
	
	
	public static void main(String[] args) {
		
		Employees emp = new Employees();
		
String empnames [ ]= { emp.EmployeeName1,emp.EmployeeName2,emp.EmployeeName3};
int empids [] = {emp.ID1,emp.ID2,emp.ID3 };

System.out.println("Employee name: " + empnames[0] +" " + " Employee ID :" + empids[0]);
System.out.println("Employee name: " + empnames[1] +" " + " Employee ID :" + empids[1]);
System.out.println("Employee name: " + empnames[2] +" " + " Employee ID :" + empids[2]);
	}

}
