package com.gimhae;

/*
 * 諛곗뿴
 * �옄猷뚰삎[]
 * 
 * �옄猷뚰삎[] 蹂��닔紐� = new �옄猷뚰삎[媛��닔];
 * 
 * call
 * 蹂��닔紐�[index]
 * 
 * index
 * 0遺��꽣 �떆�옉 ~ 媛��닔-1源뚯� 議댁옱
 * �뿰�냽�맖
 * 踰붿쐞瑜� �꽆�뼱�꽕寃쎌슦 exception 諛쒖깮
 * 
 */

public class Ex01 {
    public static void main(String[] args) {
        int[] a=new int[5];
        // a[0]=1;
        // a[1]=3;
        // a[2]=5;
        // a[3]=7;
        // a[4]=9;
        for(int i=0; i<a.length; i++){
            a[i]=i*2;
        }

        System.out.println("諛곗뿴 湲몄씠�뒗 "+a.length);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
