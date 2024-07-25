public class Ex08 {
    public static void main(String[] args) {
        //제어문
        //1. 조건문(switch)
        String su="ja";
        su+="va";
        switch (su) {
            case "web":System.out.println("삼");break;
            case "java":System.out.println("이");break;
            case "db":System.out.println("일");break;
            default://선택
                System.out.println("몰라");
                break;
        }
    }
}
