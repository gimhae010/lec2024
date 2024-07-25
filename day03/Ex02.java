class Ex02 {
    /*
     * 클래스의 구성요소 
     * 1. 메서드
     * 1-1. static 메서드
     * public static 리턴타입 메서드명(매개변수){실행코드;}
     * 
     * 메서드명
     * 키워드x
     * 문자(시작 소문자)
     * 특수문자 _$ 할수있으나 하지 않는다
     * 카멜케이스
     * 
     * 리턴타입
     * 메서드 말단의 리턴의 타입
     * 리턴값이 없을 경우 void
     * 
     * 메서드의 호출은 
     * 메서드명()
     * 메서드명(매개변수값)
     * 메서드명(매개변수값,매개변수값,..)
     * 
     * 매개변수-parameter,인자,arguments
     * (타입 변수명,타입 변수명,...)
     * 
     * 
     */  
    
    public static void func01(int dan){
        System.out.println("구구단 "+dan+"단 출력");
        for(int i=1; i<10; i++){
        System.out.println(dan+"x"+i+"="+dan*i);
        if(i==2)return;
        }
    }
    public static void main(String[] args) {
        System.out.println("시작");
        func01(9);
        System.out.println("종료");
    } 
}
