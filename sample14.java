import java.io.*;

class sample14
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("®”‚ğ“ü—Í");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1){
            System.out.println("1‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
            System.out.println("1‚ª‘I‘ğ‚³‚ê‚Ü‚µ‚½");
        }
        
        System.out.println("ˆ—‚ğI—¹‚µ‚Ü‚·B");
    }
}