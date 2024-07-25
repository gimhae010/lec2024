public class Ex03 {
    public static void main(String[] args){
        byte a=-126;
        System.out.println("byte a="+a);
        a--;
        System.out.println("byte a="+a);
        a--;
        System.out.println("byte a="+a);
        a--;
        System.out.println("byte a="+a);
        a+=1;
        a-=1;
        a*=1;
        a/=1;
        a%=1;
        a++;
        ++a;
        --a;
        a--;
        int b=1;
        b=b+++b+++b;
        b=(b++)+b+(++b);
        b=b+(++b)+(++b);
    }
}
/*
 * 3    011
 * 2    010
 * 1    001
 * 0    000
 * -1   111
 * -2   110
 * -3   101
 * -4   100
 * 
 */
