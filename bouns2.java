package ex;

import java.util.Scanner;

public class bouns2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean break1 = false;
		while (true) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요.");
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("입력하기를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("출력하기를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("삭제하기를 선택하셨습니다.");
				break;
			case 4:
				System.out.println("끝내기를 선택하셨습니다.");
				break1 = true;
				break;
			default:
				System.out.println("잘못선택하셨습니다.");
				break;
			}
			if (break1) {
				break;
			}

		}
	}

}
