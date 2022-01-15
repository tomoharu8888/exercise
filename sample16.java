import java.io.*;

class sample16
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("®”‚ğ“ü—Í");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1){
            System.out.println("1‚ª“ü—Í‚³‚ê‚½");
        }
        else if(res == 2){
            System.out.println("2‚ª“ü—Í‚³‚ê‚½");
        }
        else{
            System.out.println("1‚©‚Q‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        }
    }

}