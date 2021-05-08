import java.util.Scanner;

public class otD {
 
public static void main(String args[]) 
   {
     Scanner in = new Scanner(System.in);
     int on, dn = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
		on = in.nextInt();
    while (on != 0) 
     {
      dn = (int)(dn + (on % 10) * Math.pow(8, i++));
      on = on / 10;
     }
    System.out.print("Equivalent decimal number: " + dn+"\n");
   }
}