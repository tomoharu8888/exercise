import java.io.*;

class sample17
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("®”‚ğ“ü—Í");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
               System.out.println("‚P‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
               break;
            case 2:
               System.out.println("‚Q‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
               break;
            default:
               System.out.println("‚P‚©‚Q‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
               break;
        }
    }
}