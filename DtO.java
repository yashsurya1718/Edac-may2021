import java.util.Scanner;

public class DtO {
 
public static void main(String args[]) 
   {
     Scanner in = new Scanner(System.in);
     int on, dn = 0;
     int i = 0;
     System.out.print("Input any decimal number: ");
		on = in.nextInt();
    while (on != 0) 
     {
      dn = (int)(dn + (on % 8) * Math.pow(10, i++));
      on = on / 8;
     }
    System.out.print("Equivalent octal number: " + dn+"\n");
   }
}