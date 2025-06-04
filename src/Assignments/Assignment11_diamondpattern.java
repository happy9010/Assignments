package Assignments;

public class Assignment11_diamondpattern {

	public static void main(String[] args) {
		 int i,j;
			
			for (i=1;i<=5;i++)
			{
				for (j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		//	System.out.println("++++++++++++++++");
			
			
			int k,l;
			for (k=4;k>=1;k--)
			{
				for(l=1;l<=k;l++)
				{
					System.out.print(l+ " ");
				}
				
				System.out.println();
			}

		

	}

}
