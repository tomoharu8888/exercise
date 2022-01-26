import java.io.*;

class Sample47
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("‰½”Ô–Ú‚Ìˆ—‚Å’†~‚µ‚Ü‚·‚©H(1 - 20)");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1; i<=20; i++){
            System.out.println(i + "”Ô–Ú‚Ìˆ—‚Å‚·");
            if(res == i)
            break;
        }
    }
}