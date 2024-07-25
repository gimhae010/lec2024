public class Ex17 {
    public static void main(String[] args) {
        //1~100합,1+3+5+7+9=000
        int sum=0;
        for(int i=1; i<=10; i++){
            if(i%2==1){
                sum+=i;
                System.out.print(i);
            }else if(i==10){
                System.out.println("="+sum);
            }else{
                System.out.print("+");
            }
        }
    }
}
