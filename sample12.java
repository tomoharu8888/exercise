import java.io.*;

class sample12
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("��������͂���");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

         String str = br.readLine();
         int res = Integer.parseInt(str);

         if(res == 1)
         System.out.println("1�����͂���܂���");

         System.out.println("�������I�����܂�");
    }
}