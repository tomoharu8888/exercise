import java.io.*;

class sample17
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
               System.out.println("�P�����͂���܂���");
               break;
            case 2:
               System.out.println("�Q�����͂���܂���");
               break;
            default:
               System.out.println("�P���Q����͂��Ă�������");
               break;
        }
    }
}