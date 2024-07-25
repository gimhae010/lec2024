class Ex04 {
    public static void main(String[] args) {
        // me;    // 클래스타입 변수명;
        for(int i=0; i<3; i++){
            Ex04 me=new Ex04();
            me.func01();
        }
    }

    public void func01(){
        System.out.println("non-static method func01");
    }
}
