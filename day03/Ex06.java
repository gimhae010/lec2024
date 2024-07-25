/*
 * 클래스의 구성요소
 * 2.변수
 * 2-1. 클래스변수(static)
 * 2-2. 맴버필드(non-static)
 * 
 * 
 * 
 * 
 */
class Ex06 {
    public static int su1=1111;
    public int su2=2222;
    public static int su5=0;
    public static String msg=null;

    public static void func01(){
        System.out.println(su1);
        Ex06 me=new Ex06();
        System.out.println(me.su2);
    }
    public static void main(String[] args) {
        int su3=3333;
        int su4;
        su4=4444;
        System.out.println(su1);
        Ex06 me=new Ex06();
        System.out.println(me.su2);
        System.out.println();
        System.out.println();
    }    
}
