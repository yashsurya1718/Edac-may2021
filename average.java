import java.util.Scanner;
class average
 {
    
    public static void main(String[] args) 
	{
	  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=sc.nextInt();
		System.out.print("Enter second number:");
		int b=sc.nextInt();
		System.out.print("Enter third number:");
		int c=sc.nextInt();
		int d=(a+b+c)/3;
		System.out.print("Average:"+d);
		//System.out.println((a+"+"b+"+"c+)"/"3);
	}
}