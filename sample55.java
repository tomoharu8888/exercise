import java.io.*;

class Sample55
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�e�X�g�̓_������͂��Ă��������B0�ŏI��");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int sum = 0;

        do{
            String str = br.readLine();
            num = Integer.parseInt(str);
            sum += num;
        }while(num != 0);

        System.out.print("�e�X�g�̓_���́A" + sum + "�_�ł�");
    }
}