import java.io.*;

class Sample48
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("¬Ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(1 - 5)");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            case 2:
            System.out.println("‚à‚Á‚ÆŠæ’£‚è‚Ü‚µ‚å‚¤");
            break;
            case 3:
            case 4:
            System.out.println("‚æ‚­Šæ’£‚è‚Ü‚µ‚½");
            break;
            case 5:
            System.out.println("‚½‚¢‚Ö‚ñ—DG‚Å‚·");
            break;
            default:
            System.out.println("1~5‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        }
    }
}