import java.io.*;

import javax.management.openmbean.InvalidOpenTypeException;

class sample33
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("0から10の整数を入力してください");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res >= 0 && res <= 10){
            System.out.println("正解");
        }
        else{
            System.out.println("不正解");
        }
    }
}