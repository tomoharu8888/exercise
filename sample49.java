import java.io.*;

class Sample49
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�R�i�K�]���̐��т���͂��Ă�������");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            System.out.println("�撣��܂��傤");
            break;
            case 2:
            System.out.println("���Ƃ�������");
            break;
            case 3:
            System.out.println("�����ւ�悭�o���܂���");
            break;
        }
    }
}