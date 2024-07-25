public class Ex14 {
    public static void main(String[] args) {
        /*다음을 출력하시오
         * Q1.                    Q2.               Q3.
         * 1 2 3                  1 2 3             A B C
         * 4 5 6                  2 3 4             D E F
         * 7 8 9                  3 4 5             G H I
         * 
         * Q4.                    Q5.               Q6.
         * 1                      1                 1 
         * 2 2                    1 2               2 3
         * 3 3 3                  1 2 3             4 5 6
         * 
         * Q7. 1~100까지 짝수의 합을 출력하세요
         * 
         * Q8. 다음을 출력하세요
         * 1+3+5+7+9=000
         * 
         * Q9. <print/>
         */
        System.out.println("Q1.=============================");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("Q1.=============================");
        int su=123;
        for(int n=0; n<3; n++){
        System.out.println(su+333*n);
        }
        System.out.println("Q1.=============================");
        System.out.println("1 2 3 \n4 5 6 \n7 8 9");
        for(int i=1; i<10; i++){
            System.out.print(i+" ");
            if(i%3==0)System.out.println();
            
        }
        System.out.println("Q1.=============================");

        for(int j=1; j<=7;j+=3){
            for(int i=j; i<j+3; i++){
                System.out.print(i+" ");
            }
            System. out.println();
        }
        System.out.println("Q4.=============================");
        System.out.println("1");
        System.out.println("2 2");
        System.out.println("3 3 3");
        System.out.println("Q4.=============================");
        for(int d=1;d<4;d++){
            for(int i=d; i<d*2; i++){
            System.out.print(d+" ");
            }
            System.out.println();
        }
        System.out.println("Q4.=============================");
        System.out.println("1 1 1");
        System.out.println("2 2 2");
        System.out.println("3 3 3");

        System.out.println("Q4.=============================");
        for(int i=1; i<4; i++){
            if(i==1||i==2||i==3)System.out.print(i+" ");
            if(i==2||i==3)System.out.print(i+" ");
            if(i==3)System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("Q4.=============================");
        for(int i=1; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
