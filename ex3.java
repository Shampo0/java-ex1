package ex;

import java.util.Scanner;

public class ex3 {
	public static void arithmetic() {

	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("���� ��� =>" + a+b);
	System.out.println("���� ��� =>" + (a-b));
	System.out.println("���� ��� =>" + a*b);
	System.out.println("������ ��� =>"+ a/b);
	System.out.println("������ ������ ��� =>"+ a%b);
	};

	public static void main(String[] args) {
		arithmetic();

	}
}
