import java.io.*;

class sample18
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("type a or b");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char res = str.charAt(0);

        switch(res){
            case 'a':
               System.out.println("a‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
               break;
            case 'b':
               System.out.println("b‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
               break;
            default:
            break;
        }
    }
}