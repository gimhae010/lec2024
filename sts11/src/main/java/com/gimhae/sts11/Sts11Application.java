package com.gimhae.sts11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sts11Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Sts11Application.class, args);
	}

	@FunctionalInterface
	interface Inter01{
		void test(int a);
//		void func2();
	}
	
	@FunctionalInterface
	interface Inter02{
		int test();
	}
	@FunctionalInterface
	interface Inter03{
		int test(int a, int b);
	}
	
	void func01(Inter01 inter,int su) {
		inter.test(su);
	}
	int func02(Inter03 inter,int a,int b) {
		return inter.test(a,b);
	}
	int func03(Comparable inter,String msg) {
		return inter.compareTo(msg);
	}
	
	@Override
	public void run(String... args) throws Exception {
		int a=1111;
//		var func=(a,b)=>{return a+b;}
		// 인터페이스(하나의 메서드만 선언)
//		Inter01 inter=(su)->{};
		Inter01 inter01=su->{};
//		Inter02 inter02=()->{return 0;};
		Inter02 inter02=()->0;
//		Inter03 inter03=(x,y)->{return x+y;};
		Inter03 inter03=(x,y)->x+y;
		func02((x,y)->x*y,1,2);
		func03(o -> 1234,"test");
		
		Inter04 inter04=()->System.out.println("func01 run..");
		
//		inter04.func01();
//		Inter04.func02();
//		inter04.func03();
//		inter04.func04();
		//매개변수 o, 리턴 x
		Consumer test1=(x)->System.out.println(x); 
		//매개변수 x, 리턴 o
		Supplier test2=()->1234;
		//매개변수 o, 리턴 o
		Function test3=(x)->x;
		
		//매개변수 o o, 리턴 o
		java.util.function.IntBinaryOperator test4=(x,y)->x+y;
		java.util.function.DoubleBinaryOperator test6=(x,y)->x+y;
		
		//매개변수 o , 리턴 o t/f
		Predicate test5=(x)->true;
		
		
//		Runnable func=()->{
//			System.out.println(Thread.currentThread().getName());
//		};
//		Runnable func=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println(Thread.currentThread().getName());
//			}
//		};
//		Thread thr=new Thread(func);
//		thr.start();
//		System.out.println("main:"+Thread.currentThread().getName());
		
		
		
//		Stream<String> stream = Stream.of("item1", "item2", "item3", "item4");
//		Stream<Integer> stream = Stream.of(1,2,3,4);
//		Stream<String> stream = Stream.empty();
//		List list=List.of("item1", "item2", "item3", "item4");
//		Stream<String> stream = list.stream();
//		String[] list= {"item1", "item2", "item3", "item4"};
//		Stream<String> stream=Arrays.stream(list);
//		Stream<String> stream=Stream.generate(()->"item").limit(4);
//		Stream<String> stream=Stream.iterate("item", n -> n + 1).limit(5);
//		Stream<String> stream=Stream.<String>builder()
//											.add("item1")
//											.add("item2")
//											.add("item3")
//											.add("item4")
//											.build();
//		stream.forEach(s -> System.out.println(s));
		IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
		LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		DoubleStream doubles = new Random().doubles(3); // 난수 3개 생성
		IntStream charsStream ="Stream".chars(); // [83, 116, 114, 101, 97, 109]
		Stream<String> stringStream =Pattern.compile(",").splitAsStream("item1,item2,item3");
		stringStream.forEach(s -> System.out.println(s));
	}

}

















