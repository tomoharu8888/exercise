import java.io.*;

class sample16
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1){
            System.out.println("1�����͂��ꂽ");
        }
        else if(res == 2){
            System.out.println("2�����͂��ꂽ");
        }
        else{
            System.out.println("1���Q����͂��Ă�������");
        }
    }

}