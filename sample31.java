//整数の比較
import java.io.*;

class sample31
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を２つ入力");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1 < num2){
            System.out.println(num1 + "より" + num2 + "の値が大きい");
        }
        else if(num1 > num2){
            System.out.println(num2 + "より" + num1 + "の値が大きい");
        }
        else{
            System.out.println("同じ値である");
        }
    }
}