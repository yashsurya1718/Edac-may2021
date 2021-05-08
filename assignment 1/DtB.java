import java.util.Scanner;

public class DtB {
 
public static void main(String args[]) 
   {
     Scanner in = new Scanner(System.in);
     int on, dn = 0;
     int i = 0;
     System.out.print("Input any decimal number: ");
		on = in.nextInt();
    while (on != 0) 
     {
      dn = (int)(dn + (on % 2) * Math.pow(10, i++));
      on = on / 2;
     }
    System.out.print("Equivalent binary number: " + dn+"\n");
   }
}