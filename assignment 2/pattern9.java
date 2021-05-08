import java.util.*;
class pattern9
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=0;i<5;i++)
		
		{
			
			for( k=4;k>=i;k--)
			{
				System.out.print(" ");
			}

			
			for( j=0;j<=i;j++)
			{
				System.out.print((char)(j+65));
				System.out.print(" ");
			}
			//alpha++;
			System.out.println();
		}
	}
}