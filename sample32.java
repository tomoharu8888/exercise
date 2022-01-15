import java.io.*;

class sample32
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("‚O‚©‚ç‚P‚O‚Ü‚Å‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res >= 0 && res <= 10){
            System.out.println("³‰ğ‚Å‚·");
        }
        else{
            System.out.println("•s³‰ğ‚Å‚·");
        }
    }
}