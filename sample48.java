import java.io.*;

class Sample48
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("成績を入力してください(1 - 5)");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            case 2:
            System.out.println("もっと頑張りましょう");
            break;
            case 3:
            case 4:
            System.out.println("よく頑張りました");
            break;
            case 5:
            System.out.println("たいへん優秀です");
            break;
            default:
            System.out.println("1~5を入力してください");
        }
    }
}