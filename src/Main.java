import java.util.*;
public class Main {
    public static void main (String args[]){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String input= scr.nextLine();
        String ignore = "0x";
        int base=16;
        int exponent;
        long decimal=0;
        long decimal2 =0;
        long decimalfinal=0;
        int intversionofx;
        if (input.contains(ignore)){
            input = input.replace(ignore, "");

        }
        int stringlength = input.length()-1;
        char last = input.charAt(stringlength);


        for (int i= stringlength, power=0;i>=0;i--,power++)
        {
            char x = input.charAt(i);
            if (x<='9' && x>='0')
            {
                intversionofx = (int) x - '0';
                double doubleofdecimal = Math.pow(base, power);
                decimal=intversionofx * (long)doubleofdecimal;




            }
            if (x>='A'&& x<='F')
            {
                intversionofx=(int) x - 55;
                double doubleofdecimal = Math.pow(base, power);
                decimal=intversionofx * (long)doubleofdecimal;

            }
            if (x>='a'&& x<='f')
            {
                intversionofx=(int) x-87;

                double doubleofdecimal = Math.pow(base, power);
                decimal=intversionofx * (long)doubleofdecimal;

            }
            decimalfinal = decimal+decimalfinal;
        }
        System.out.println("Your number is "+decimalfinal+" in decimal");


    }

}


