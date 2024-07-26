package day04;

/*
 * 계산기(ver 0.1.0)
 * 
 * 1.+ 2.- 3.× 4.÷ 0.종료>3
 * 첫번째숫자입력>5
 * 두번째숫자입력>3
 * 5×3=15
 * 
 * 
 * 1.+ 2.- 3.× 4.÷ 0.종료>1
 * 첫번째숫자입력>5
 * 두번째숫자입력>3
 * 5+3=8
 * 
 * 1.+ 2.- 3.× 4.÷ 0.종료>0
 * 이용해주셔서 감사합니다.
 */

public class Ex10 {
    public static int input,input2,input3;
    public static java.util.Scanner sc;
    public static void main(String[] args) {
        sc=new java.util.Scanner(System.in);
        System.out.println("계산기(ver 0.1.0)");
        String result="";
        while(true){
            input=userInput("1.+ 2.- 3.× 4.÷ 0.종료>");
            if(input==0)break;
            input2=userInput("첫번째숫자입력>");
            input3=userInput("두번째숫자입력>");

            result=""+input2;            
            if(input==1){
                result=func01(input2+input3+"");
            }
            else if(input==2){
                result=func01(input2-input3+"");
            }
            else if(input==3){
                result=func01(input2*input3+"");
            }
            else if(input==4){
                if((input2%input3)==0){
                    result=func01(input2/input3+"");
                }else{
                    result=func01(1.0*input2/input3+"");
                }
            }
            System.out.println(result);
        }
        System.out.println("이용해주셔서 감사합니다.");
    }
    public static int userInput(String msg){
        System.out.print(msg);
        return sc.nextInt();
    }
    public static String func01(String result){
        if(input==1)input='+';
        if(input==2)input='-';
        if(input==3)input='×';
        if(input==4)input='÷';

        return ""+input2+(char)input+input3+"="+result;
    }
}
