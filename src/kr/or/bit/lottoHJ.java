package kr.or.bit;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
//	static int[] myLotto = new int[6];
//	static int[] myLotto = {(int)(Math.random()*(9)+1), (int)(Math.random()*(9)+1), (int)(Math.random()*(9)+1)};
	Scanner scanner = new Scanner(System.in);
	static void start() {
		//메뉴 나오고 시작
	}
	
	
	void event1() {
		
	}
	
	boolean event2Verify(int a, int b, int[] arr) { //내가 입력한 2개 번호는 추출하지 않는다
		
		boolean flag = true;
		for(int value : arr) {
			if(value == a || value == b) {
				System.out.print("ㄱㄷ 다시 뽑음!!");
				System.out.println(Arrays.toString(arr));
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public int[] event2() {
		System.out.print("제외할 번호를 두 개 입력하세요 >>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] arr = new int[6];
		while(true) {
			arr = ran();
			if(event2Verify(a, b, arr))
				break;
		}
		return arr;
	}
	
	

	
	
	static int[] ran() {
		int[] arr = {(int)(Math.random()*(9)+1), (int)(Math.random()*(9)+1), (int)(Math.random()*(9)+1)};
		return arr;
	}
	
}


/// 범종범종