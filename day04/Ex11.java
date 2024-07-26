package day04;
/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 
 */
public class Ex11 {
    public static void main(String[] args) {
        int a=1;
        for(int i=0+1;i<4+1 ; i++){
            for(int j=a;j<a+i ;j++){
                System.out.print(j);
            }
            a=a+i;
            System.out.println();
        }

    }
}
