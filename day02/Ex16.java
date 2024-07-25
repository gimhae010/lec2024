public class Ex16 {
    public static void main(String[] args) {
        /*
         * Q4.                    Q5.               Q6.
         * 1                      1                 1 
         * 2 2                    1 2               2 3
         * 3 3 3                  1 2 3             4 5 6
         */
        int m=1;
    for(int i=2; i<5; i++){
        for(int j=1; j<i; j++){
            System.out.print(m+++" ");
        }
        System.out.println();
    }

    }

}
