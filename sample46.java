import java.io.*;

class Sample46
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���Ԗڂ̃��[�v�Œ��~���܂����H�i1 - 10�j");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1; i<=10; i++){
            System.out.println(i + "�Ԗڂ̏����ł�");
            if(i == res)
              break;
        }
    }
}