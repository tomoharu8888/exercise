//�����̔�r
import java.io.*;

class sample31
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�������Q����");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1 < num2){
            System.out.println(num1 + "���" + num2 + "�̒l���傫��");
        }
        else if(num1 > num2){
            System.out.println(num2 + "���" + num1 + "�̒l���傫��");
        }
        else{
            System.out.println("�����l�ł���");
        }
    }
}