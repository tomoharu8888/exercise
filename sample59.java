import java.io.*;

class Sample59
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i=2; i<=num; i++){
            if(i == 0){
                System.out.println(num + "�͑f���ł�");

            }
            else if(num % i == 0){
                System.out.println(num + "�͑f���ł͂���܂���");
                break;
            }
        }
    }
}