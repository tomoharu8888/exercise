//���т̔���
import java.io.*;

class sample34
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���т���͂��Ă�������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
              System.out.println("�����ƕ׋����悤");
              break;
            case 2:
              System.out.println("���������撣�낤");
              break;
            case 3:
              System.out.println("����ɏ��ڎw���܂��傤");
              break;
            case 4:
              System.out.println("��ς悭�ł��܂���");
              break;
            case 5:
              System.out.println("�����ւ�D�G�ł�");
              break;

        }
    }
}