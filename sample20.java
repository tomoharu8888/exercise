import java.io.*;

class sample20
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���Ԗڂ̃R�[�X�ɂ��܂����H");
        System.out.println("��������͂��Ă�������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        char ans;
        if(res == 1)
          ans = 'A';
        else
          ans = 'B';

        System.out.println(ans + "�R�[�X��I�����܂���");
    }
}