import java.io.*;

class sample32
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�O����P�O�܂ł̐�������͂��Ă�������");
        
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res >= 0 && res <= 10){
            System.out.println("�����ł�");
        }
        else{
            System.out.println("�s�����ł�");
        }
    }
}