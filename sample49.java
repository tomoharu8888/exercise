import java.io.*;

class Sample49
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("３段階評価の成績を入力してください");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
            System.out.println("頑張りましょう");
            break;
            case 2:
            System.out.println("あともう少し");
            break;
            case 3:
            System.out.println("たいへんよく出来ました");
            break;
        }
    }
}