class pattern45
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=n;i>=1;i--)
		{
					
			for(int k=n-1;k>=i;k--)
			{
			System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
			
	}
	
}