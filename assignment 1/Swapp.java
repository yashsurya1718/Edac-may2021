import java.util.Scanner;

class Swapp
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter 2 Integer Numbers");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int temp;
		
		System.out.println("i:"+i);
		
		System.out.println("j:"+j);
		temp=i;
		i=j;
		j=temp;
		
		
		System.out.println("After Swapping");
		System.out.println("i"+i);
		System.out.println("j:"+j);
	}
}