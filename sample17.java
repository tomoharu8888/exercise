import java.io.*;

class sample17
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を入力");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
               System.out.println("１が入力されました");
               break;
            case 2:
               System.out.println("２が入力されました");
               break;
            default:
               System.out.println("１か２を入力してください");
               break;
        }
    }
}