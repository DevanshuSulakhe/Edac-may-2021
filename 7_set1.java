package PatternAsmntNo2;

public class 7_set1
{

	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		
		}
	}

}