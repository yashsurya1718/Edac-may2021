import java.util.Scanner;
public class BAdd {
 public static void main(String[] args)
 {
  long b1, b2;
  int i = 0, carry = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Input first binary number: ");
  b1 = in.nextLong();
  System.out.print("Input second binary number: ");
  b2 = in.nextLong();

	
  while (b1 != 0 || b2 != 0) 
  {
   sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
   carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  if (carry!= 0) {
   sum[i++] = carry;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}