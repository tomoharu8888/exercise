import java.io.*;

class Sample62
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("óŒ±Ò”‚ğ“ü—Í");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int[] test;
        test = new int[num];

        for(int i=0; i<num; i++){
            str = br.readLine();
            int tmp = Integer.parseInt(str);
            test[i] = tmp;
        }

        for(int i=0; i<num; i++){
            System.out.println((i+1) + "”Ô–Ú‚Ìl‚Ì“_”‚Í" + test[i] + "‚Å‚·");
        }
    }
}