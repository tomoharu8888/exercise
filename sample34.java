//成績の判別
import java.io.*;

class sample34
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("成績を入力してください");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
              System.out.println("もっと勉強しよう");
              break;
            case 2:
              System.out.println("もう少し頑張ろう");
              break;
            case 3:
              System.out.println("さらに上を目指しましょう");
              break;
            case 4:
              System.out.println("大変よくできました");
              break;
            case 5:
              System.out.println("たいへん優秀です");
              break;

        }
    }
}