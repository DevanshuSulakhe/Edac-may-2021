public class 18_set1 {

	public static void main(String[] args) 
	{
		int i,j,alpha=64;
		for(i=5;i>=1;i--)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}

}