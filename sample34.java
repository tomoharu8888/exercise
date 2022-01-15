//¬Ñ‚Ì”»•Ê
import java.io.*;

class sample34
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("¬Ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
              System.out.println("‚à‚Á‚Æ•×‹­‚µ‚æ‚¤");
              break;
            case 2:
              System.out.println("‚à‚¤­‚µŠæ’£‚ë‚¤");
              break;
            case 3:
              System.out.println("‚³‚ç‚Éã‚ğ–Úw‚µ‚Ü‚µ‚å‚¤");
              break;
            case 4:
              System.out.println("‘å•Ï‚æ‚­‚Å‚«‚Ü‚µ‚½");
              break;
            case 5:
              System.out.println("‚½‚¢‚Ö‚ñ—DG‚Å‚·");
              break;

        }
    }
}