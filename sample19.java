import java.io.*;

class sample19
{
    public static void main(String[] args) throws IOException
   {
       

    System.out.println("‚ ‚È‚½‚Í’j«‚Å‚·‚©H");
    System.out.println("Y‚Ü‚½‚ÍN‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");

    BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    char res = str.charAt(0);

    if(res == 'Y' || res == 'y'){
        System.out.println("‚ ‚È‚½‚Í’j«‚Å‚·‚Ë");
    }
    else if(res == 'N' || res == 'n'){
        System.out.println("‚ ‚È‚½‚Í—«‚Å‚·‚Ë");
    }
    else{
        System.out.println("Y‚Ü‚½‚ÍN‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
     }
   }
}