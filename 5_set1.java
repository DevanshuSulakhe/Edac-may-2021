public class 5_set1 {

	public static void main(String[] args) 
	{
		int i,j,alpha=64;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}

	}

}