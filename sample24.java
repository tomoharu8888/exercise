import java.io.*;

class sample24
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("��������͂��Ă�������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if((res % 2) == 0)
          System.out.println(res + "�����ł�");
        
        else
          System.out.println(res + "��ł�");
    }
}