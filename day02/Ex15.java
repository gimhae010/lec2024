public class Ex15 {
    public static void main(String[] args) {
                /*다음을 출력하시오
         * Q1.                    Q2.               Q3.
         * 1 2 3                  1 2 3             A B C
         * 4 5 6                  2 3 4             D E F
         * 7 8 9                  3 4 5             G H I */
        // 123 234 345
        int cnt=0;
        for(int i=1; i<6; i++){
            System.out.print(i+" ");
            if(i==5)break;
            if(cnt++==2){i-=2;cnt=0;System.out.println();}
        }
        System.out.println("-------------------");
        for(int a=0;a<3;a++){
            for(int b=1; b<4; b++){
                System.out.print(b+a+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        int c1='A';
        int c2='Z';
        int cnt2=0;
        int cols=5;
        for(int i=c1; i<c2+1; i++){
            cnt2++;
            System.out.print((char)i+" ");
            if(cnt2==cols){
                System.out.println();
                cnt2=0;
            }
        }
        System.out.println("---------------------------");
        for(int j=1; j<=7;j+=3){
            for(int i=j; i<j+3; i++){
                System.out.print((char)(64+i)+" ");
            }
            System. out.println();
        }
    }
}
