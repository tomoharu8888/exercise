class Sample66
{
    public static void main(String[] args)
    {
        int[] test1;
        test1 = new int[3];

        int[] test2;

        test2 = test1;
        System.out.println("test2‚Étest1‚ð‘ã“ü‚µ‚Ü‚µ‚½");

        for(int i=0; i<3; i++){
            System.out.println("test1" + test1[i]);
        }

        for(int i=0; i<3; i++){
            System.out.println("test2" + test2[i]);
        }
    }
}