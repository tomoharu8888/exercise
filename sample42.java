//iが繰り返し処理される内に、jが処理される
class Sample42
{
    public static void main(String[] args)
    {
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.println("iは" + i + ":jは" + j);
            }
        }
    }
}