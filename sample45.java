class Sample45
{
    public static void main(String[] args)
    {
        boolean bl = false;
        for(int i=0; i<55; i++){
            for(int j=0; j<55; j++){
                if(bl == false){
                    System.out.print("*");
                    bl = true;
                }
                else{
                    System.out.print("_");
                    bl = false;
                }
           }
           System.out.print("\n");
        }
    }
}