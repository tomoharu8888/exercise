import java.io.*;

class sample16
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を入力");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1){
            System.out.println("1が入力された");
        }
        else if(res == 2){
            System.out.println("2が入力された");
        }
        else{
            System.out.println("1か２を入力してください");
        }
    }

}