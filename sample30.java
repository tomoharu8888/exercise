import java.io.*;

class sample30
{
    public static void main(String[] args) throws IOException
    {
    System.out.println("�Q�̐�������͂��Ă�������");

    BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    if(num1 < num2){
        System.out.println(num1 + "���" + num2 + "�̂ق��̒l���傫���ł�");
    }
    else if(num1 > num2){
        System.out.println(num2 + "���" + num1 + "�̂ق��̒l���傫���ł�");
    }
    else{
        System.out.println("�ӂ��̒l�͓����ł�");
    }
 }
}