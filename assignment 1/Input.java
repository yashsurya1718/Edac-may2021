import java.util.Scanner;

class Input
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter 2 Integer Numbers");
		System.out.print("Input First Number:");
		int i=sc.nextInt();
		System.out.print("Input Second Number:");
		int j=sc.nextInt();
		int k=i*j;
		System.out.println("Expected output ");
		System.out.print(+i);
		System.out.print("*"+j);
		System.out.println("="+k);
			}
}