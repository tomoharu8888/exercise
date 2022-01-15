import java.io.*;

class sample30
{
    public static void main(String[] args) throws IOException
    {
    System.out.println("‚Q‚Â‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");

    BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    if(num1 < num2){
        System.out.println(num1 + "‚æ‚è" + num2 + "‚Ì‚Ù‚¤‚Ì’l‚ª‘å‚«‚¢‚Å‚·");
    }
    else if(num1 > num2){
        System.out.println(num2 + "‚æ‚è" + num1 + "‚Ì‚Ù‚¤‚Ì’l‚ª‘å‚«‚¢‚Å‚·");
    }
    else{
        System.out.println("‚Ó‚½‚Â‚Ì’l‚Í“¯‚¶‚Å‚·");
    }
 }
}