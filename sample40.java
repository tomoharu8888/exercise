import java.io.*;

class Sample40
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("‚Ç‚ê‚­‚ç‚¢‚Ì”‚ğ‡Œv‚µ‚Ü‚·‚©");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += num;
        }

        System.out.println(sum);

    }
}