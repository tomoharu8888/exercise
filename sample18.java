import java.io.*;

class sample18
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("type a or b");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char res = str.charAt(0);

        switch(res){
            case 'a':
               System.out.println("aが入力されました");
               break;
            case 'b':
               System.out.println("bが入力されました");
               break;
            default:
            break;
        }
    }
}