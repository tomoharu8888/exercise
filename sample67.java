class Sample67
{
    public static void main(String[] args)
    {
        int[] test1;
        test1 = new int[3];

        System.out.println("test1�̔z��ϐ����`���܂���");

        test1[0] = 77;
        test1[1] = 88;
        test1[2] = 99;

        System.out.println("test1�z��ϐ��ɑ�����܂���");

        int[] test2;
        test2 = test1;
        
        for(int i=0; i<3; i++){
            System.out.println("test1���w��" + (i+1)+ "�Ԗڂ̐l��" + test1[i]);
        }

        for(int i=0; i<3; i++){
            System.out.println("test2���w��" + (i+1) + "�Ԗڂ̐l��" + test2[i]);
        }

        test1[2] = 1000;
        System.out.println("test1�̎w���O�Ԗڂ̐l�̓_����ύX");

        for(int i=0; i<3; i++){
            System.out.println("test1���w��" + (i+1) + "�Ԗڂ̐l��" + test1[i]);
        }

        for(int i=0; i<3; i++){
            System.out.println("test2���w��" + (i+1) + "�Ԗڂ̐l��" + test2[i]);
        }
    }
}