import java.util.*;
class pattern2
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		
		{
			int alpha=65;
			for( j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			alpha++;
			System.out.println();
		}
	}
}