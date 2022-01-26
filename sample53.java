import java.io.*;

class Sample53
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("成績を入力してください。0で終了");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int sum = 0;

        do{
            String str = br.readLine();
            num = Integer.parseInt(str);
            sum += num;
        }while(num != 0);

        System.out.println("成績の合計は" + sum + "点です");
    }
}