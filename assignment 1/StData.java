import java.util.Scanner;
class StData
{
	public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
		System.out.print("Test Data ");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=i+j;
		System.out.print(+i);
		System.out.print("+"+j);
		System.out.print("="+k);
	}
}