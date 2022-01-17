import java.io.*;

class Sample39
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("‚¢‚­‚Â‚Ü‚Å‚Ì”‚ğ‡Œv‚µ‚Ü‚·‚©H");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}