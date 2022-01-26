import java.io.*;

class Sample49
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("‚R’iŠK•]‰¿‚Ì¬Ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            System.out.println("Šæ’£‚è‚Ü‚µ‚å‚¤");
            break;
            case 2:
            System.out.println("‚ ‚Æ‚à‚¤­‚µ");
            break;
            case 3:
            System.out.println("‚½‚¢‚Ö‚ñ‚æ‚­o—ˆ‚Ü‚µ‚½");
            break;
        }
    }
}