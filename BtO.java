import java.util.*;
public class BtO {
public static void main(String[] args) 
    {
        int bn, bn1,rem, dn=0, quot, i=1, j;
        int octn[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        bn = scan.nextInt();
        bn1=bn;
     
      while(bn > 0)
        {
            rem = bn % 10;
            dn = dn + rem*i;
            //System.out.println(rem);
            i = i*2;
            bn = bn/10;
        }   

		i=1;
        quot = dn;
		
        while(quot > 0)
        {
            octn[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +bn1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octn[j]);
        }
 System.out.print("\n");
 
    }
}