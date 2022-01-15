//®”‚Ì”äŠr
import java.io.*;

class sample31
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("®”‚ğ‚Q‚Â“ü—Í");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1 < num2){
            System.out.println(num1 + "‚æ‚è" + num2 + "‚Ì’l‚ª‘å‚«‚¢");
        }
        else if(num1 > num2){
            System.out.println(num2 + "‚æ‚è" + num1 + "‚Ì’l‚ª‘å‚«‚¢");
        }
        else{
            System.out.println("“¯‚¶’l‚Å‚ ‚é");
        }
    }
}