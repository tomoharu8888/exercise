import java.io.*;

class Sample38
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("いくつまでの数を合計しますか?");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("0から" + num + "までの合計は" + sum + "です");
    }
}