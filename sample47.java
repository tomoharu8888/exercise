import java.io.*;

class Sample47
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���Ԗڂ̏����Œ��~���܂����H(1 - 20)");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1; i<=20; i++){
            System.out.println(i + "�Ԗڂ̏����ł�");
            if(res == i)
            break;
        }
    }
}