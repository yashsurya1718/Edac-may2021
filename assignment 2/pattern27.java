class pattern27
{
	public static void main(String args[])
	{
		int size=4;
		for(int i=size;i>=-size;i--)
		{
			for(int j=1;j<=Math.abs(i);j++)
			{
				System.out.print(" ");
			}
			for(int k=size;k>=Math.abs(i);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}