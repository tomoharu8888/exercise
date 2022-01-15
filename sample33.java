import java.io.*;

import javax.management.openmbean.InvalidOpenTypeException;

class sample33
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("0‚©‚ç10‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res >= 0 && res <= 10){
            System.out.println("³‰ğ");
        }
        else{
            System.out.println("•s³‰ğ");
        }
    }
}