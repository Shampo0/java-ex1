package ex;

import java.util.Scanner;

public class ex3 {
	public static void arithmetic() {

	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("µ¡¼À °á°ú =>" + a+b);
	System.out.println("»¬¼À °á°ú =>" + (a-b));
	System.out.println("°ö¼À °á°ú =>" + a*b);
	System.out.println("³ª´°¼À °á°ú =>"+ a/b);
	System.out.println("³ª´°¼À ³ª¸ÓÁö °á°ú =>"+ a%b);
	};

	public static void main(String[] args) {
		arithmetic();

	}
}
