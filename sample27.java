import java.io.*;

class sample27
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if((res % 2) == 0)
          System.out.println(res + "����");
        else
          System.out.println(res + "�");
    }
}