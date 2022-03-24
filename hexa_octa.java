package AFTERNOON;
import java.util.Scanner;

public class hexa_octa {
 public static int hex_to_decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        String hexdec_num;
        int dec_num, i=1, j;
        int octal_num[] = new int[100];
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = in.nextLine();
        
        // Convert hexadecimal to decimal
        
        dec_num = hex_to_decimal(hexdec_num);
        
        //Convert decimal to octal
        
        while(dec_num != 0)
        {
            octal_num[i++] = dec_num%8;
            dec_num = dec_num/8;
        }
		
        System.out.print("Equivalent of octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal_num[j]);
        }
		System.out.print("\n");
    }
}

