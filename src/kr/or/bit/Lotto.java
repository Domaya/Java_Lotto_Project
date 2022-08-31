package kr.or.bit;

import java.util.Scanner;

/*

1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요

(int)(Math.random()*45 + 1)

lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33

2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)

3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)

4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)

​

추가)

로또 6개의 평균이 15에서 35 사이면 추출하고 그렇지 재추출 ....

내가 입력한 2개 번호는 추출하지 않는다

짝수는 번호는 추출하지 않는다

등등 

*/
public class Lotto {
	Scanner sc = new Scanner(System.in);

		//기능 정의
		void draw() {
			System.out.println("추첨");
			
			displayMenu();
		}
		
		void setRange() {
			System.out.println("범위 설정");
		}
		
		void exemptionNum() {
			System.out.println("제외번호 설정");
		}
		
		void exemptionEvenNum() {
			System.out.println("홀수 번호 설정");
		}
		void exemptionOddNum() {
			System.out.println("짝수 번호 설정");
		}
		
		int displayMenu() {
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("***  *******    ****       ***       ***      ***");
			System.out.println("***  ******  **  ****  ******  ****  **  ***");
			System.out.println("***  ******   *   ****  ******  ****   *  ***");
			System.out.println("***       ****    *****  ******  *****    ****");
			System.out.println("**************************************");
			System.out.println("******로또 추첨 프로그램에 오신걸 환영합니다.******");
			System.out.println("**********원하시는 메뉴를 고르세요************");
			System.out.println("***************************************");
			System.out.println("1. 추첨시작");
			System.out.println();
			System.out.println("2. 번호 범위 설정");
			System.out.println();
			System.out.println("3. 제외 번호 설정");
			System.out.println();
			System.out.println("4. 짝수 번호 제외 ");
			System.out.println();
			System.out.println("5. 홀수 번호 제외");
			System.out.println();
			System.out.println("6. 프로그램 종료");
			int input = 0;
			do {
				try {
					input = Integer.parseInt(sc.nextLine()); //1 or 2 입력 
					if(input >= 1 && input <= 6) {
						
						break; //do~while 탈출
					}else {
						//1보다 작고  6 보다 큰값 
						//나는 실제 오류가 아니지만 (예외가 아니지만) 
						//이런 상황을 예외를 만들 수 있어요
						throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
					}
				}catch (Exception e) {
					System.out.println("원인파일 : " + e.getMessage());
					System.out.println("메뉴 선택 문제 발생");
					System.out.println("1~6까지 번호만 입력해주세요");
				}
			}while(true);
			
			//1~6까지 중 하나를 선택했다면
			return input;
	}
public static void main(String[] args) {
	Lotto lotto = new Lotto();
	
	
		switch(lotto.displayMenu()) {
		case 1 : lotto.draw();
		break;
		case 2 : lotto.setRange();
		break;
		case 3 : lotto.exemptionNum();
		break;
		case 4 : lotto.exemptionEvenNum();
		break;
		case 5 : lotto.exemptionOddNum();
		break;
		case 6 : System.out.println("프로그램을 종료합니다.");
		 System.exit(0);
		
	
	
	}
}
}
