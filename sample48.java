import java.io.*;

class Sample48
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���т���͂��Ă�������(1 - 5)");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            case 2:
            System.out.println("�����Ɗ撣��܂��傤");
            break;
            case 3:
            case 4:
            System.out.println("�悭�撣��܂���");
            break;
            case 5:
            System.out.println("�����ւ�D�G�ł�");
            break;
            default:
            System.out.println("1~5����͂��Ă�������");
        }
    }
}