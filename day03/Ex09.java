/*
 * 가위바위보 게임(ver 0.1.0)
 * 가위(1),바위(2),보(3),종료(0)>1
 * 당신-가위, 컴퓨터-바위
 * 당신은 졌습니다.
 * 
 * 가위(1),바위(2),보(3),종료(0)>2
 * 당신-바위, 컴퓨터-가위
 * 당신이 이겼습니다.
 * 
 * 가위(1),바위(2),보(3),종료(0)>2
 * 당신-바위, 컴퓨터-바위
 * 비겼습니다.
 * 
 * 가위(1),바위(2),보(3),종료(0)>0
 * 총점 1승 1무 1패
 * 이용해주셔서 감사합니다.
 * 
 */

public class Ex09 {

    public static String func01(int a,String who,char b){
            String result="";
            if(a==0)result=who+" 가위"+b;
            if(a==1)result=who+" 바위"+b;
            if(a==2)result=who+"you 보"+b;
            return result;
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int a,b,c;
        a=0;b=0;c=0;
        boolean boo=true;
        int input=0;
        int com=0;
        System.out.println("가위바위보 게임(ver 0.1.0)");
        String result="";
        while (boo) {
            result="";
            System.out.print("가위(1),바위(2),보(3),종료(0)>");
            input=sc.nextInt();
            com=(int)(Math.random()*3);// 0*3<=com<1*3
            if(input==0)break;
            input-=1;
            result=func01(input,"you",'\t')
                        +func01(com, "com", '\n');

            if(input==com){
                b++;
                result+="비겼음";
            }else if((input==0&&com==2)
                    ||(input==1&&com==0)
                    ||(input==2&&com==1)){
                a++;
                result+="이겼음";
            }else if((input==0&&com==1)
                    ||(input==1&&com==2)
                    ||(input==2&&com==0)){
                c++;
                result+="졌음";
            }
            System.out.println(result);
        }
        System.out.println("\n총점 "+a+"승 "+b+"무 "+c+"패");
        System.out.println("이용해주셔서 감사합니다.");
    }
}
