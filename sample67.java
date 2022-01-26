class Sample67
{
    public static void main(String[] args)
    {
        int[] test1;
        test1 = new int[3];

        System.out.println("test1の配列変数を定義しました");

        test1[0] = 77;
        test1[1] = 88;
        test1[2] = 99;

        System.out.println("test1配列変数に代入しました");

        int[] test2;
        test2 = test1;
        
        for(int i=0; i<3; i++){
            System.out.println("test1が指す" + (i+1)+ "番目の人は" + test1[i]);
        }

        for(int i=0; i<3; i++){
            System.out.println("test2が指す" + (i+1) + "番目の人は" + test2[i]);
        }

        test1[2] = 1000;
        System.out.println("test1の指す三番目の人の点数を変更");

        for(int i=0; i<3; i++){
            System.out.println("test1が指す" + (i+1) + "番目の人は" + test1[i]);
        }

        for(int i=0; i<3; i++){
            System.out.println("test2が指す" + (i+1) + "番目の人は" + test2[i]);
        }
    }
}