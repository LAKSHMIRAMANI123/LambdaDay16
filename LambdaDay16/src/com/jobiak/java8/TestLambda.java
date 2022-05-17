package com.jobiak.java8;

/*interface Test{
	public void print();
}*/
@FunctionalInterface
interface Test1{
	public void add(int a, int b);
}

interface Test2{
	public int factorial(int n);
}

public class TestLambda {

	public static void main(String[] args) {
		
		Test1 test1 = (int a, int b) ->{
											int c = a+b;
											System.out.println(c);};
		test1.add(10, 20);
		
		/*
		 * Test test2 = (int n) -> { int fact=1; int i=1; while(i<=n) { fact*=i; i++; }
		 * return fact; }; int factorialResult = test2.factorial(5);
		 * System.out.println(factorialResult);
		 */
								
		Runnable r = () -> {	
								for(int i=1; i<=5; i++) {
									
									System.out.println(Thread.currentThread().getName() + i);
								}
							};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = () -> { 
								for(int i=10; i<=20; i++) {
									System.out.println(i);}
								
							};
		Thread t1 = new Thread(r1);
		t1.start();
	
	
	}
	
}
