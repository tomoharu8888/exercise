import java.io.*;

class sample23
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を入力");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if((res % 2) == 0)
          System.out.println(res + "は偶数です");
        
        else
          System.out.println(res + "は奇数です");
    }
}