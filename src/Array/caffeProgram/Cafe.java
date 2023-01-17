package Array.caffeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		/*
		 * 기능
		 * 1)주문하기
		 * 		- 주문가능한 메뉴를 출력한다
		 * 		- 주문 받을 메뉴를 입력받는다
		 * 		- 주문한 메뉴의 가격을 총 금액에 누적한다
		 * 		- 주문한 메뉴를 전체 메뉴리스트(장바구니)에 추가한다
		 * 		- 주문한 개수를 한개 증가한다
		 * 2)취소하기
		 * 		- 주문한 메뉴 리스트 출력한다
		 * 		- 취소할 메뉴 입력받는다
		 * 		- 입력받은 메류를 제거한다
		 * 		- 입력 받은 메뉴의 금액을 총 금액에서 뺀다
		 * 		- 주문한 개수 한 개 감소한다
		 * 3)결제하기
		 * 		- 총금액 출력
		 * 		- 지불할 금액 입력 받는다
		 * 		- 지불한 금액과 총 금액을 비교해서 지불한 금액<총금액이면 "잔돈 부족"출력
		 * 		-그게 아니라면 거스름돈과 계산완료 출력
		 * 		- 총 금액은 0원으로 주문리스트는 비워준다
		 * 		- 전체 개수를 0으로 초기화한다
		 * 
		 * 4)끝내기
		 *
		 *  <사용할 개념>
		 *  1. 무한반복
		 *  2. 문자열 배열
		 *  
		 *  <필요한 변수>
		 *  1. 전체 개수 저장할 변수
		 *  2. 주문할 메뉴를 저장할 문자열 배열
		 *  3. 총 금액 저장할 변수
		 */
		 Scanner sc = new Scanner(System.in);
		 int count = 0; 
		 String [] orderList = new String[5]; //메뉴주문은 총 5개만 가능
		 int total = 0;
		 
		 
		while(true) {
			
			System.out.println("★☆★☆★☆CAFE☆★☆★☆★");
			System.out.println("1.  주문하기");
			System.out.println("2.  취소하기");
			System.out.println("3.  결제하기");
			System.out.println("4.  끝내기");
			
			System.out.println("입력 : ");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				
				String menuName = null;
				int menuPrice = 0;
				
				System.out.println("1. 아메리카노 \t 4100원");
				System.out.println("2. 바닐라라떼 \t 5100원");
				System.out.println("3. 카페모카 \t 5500원");
				System.out.println("4. 레몬에이드 \t 5000원");
				
				System.out.println("주문할 메뉴번호 : ");
				
				int menuNum = sc.nextInt();
				
				if(menuNum == 1) {
					
					menuName = "아메리카노";
					menuPrice = 4100;
				}
				else if(menuNum == 2 ) {
					menuName = "바닐라라떼";
					menuPrice = 5100;
				}
				else if(menuNum == 3 ) {
					menuName = "카페모키";
					menuPrice = 5500;
				}
				else if(menuNum == 4 ) {
					menuName = "레몬에이드";
					menuPrice = 5000;
				}
				else {
					System.out.println("잘못 입력하셨습니다");
					continue;
				}
				total += menuPrice;
				orderList[count] = menuName;
				count++;
				System.out.println("주문한 메뉴는 " + menuName + "입니다");
				System.out.println("총 가격은 " + menuPrice + "입니다");
			}
			else if(num == 2) {
				System.out.println("★☆★☆★☆주문한 메뉴 리스트★☆★☆★☆");
				for(int i =0; i<count; i++) {
					System.out.println(i+1 +"." +orderList[i]);
				}
				System.out.println("취소할 메뉴 번호");
				int cancleNum = sc.nextInt();
				if(1<=cancleNum && cancleNum<=count) {
					String delMenu = orderList[cancleNum-1];
					System.out.println(delMenu + "메뉴 삭제!");
					for(int i = cancleNum -1 ;i<count; i++) {
						orderList[i] = orderList[i+1];
					}
					
					if(delMenu.equals("아메리카노")) {
						total -= 4100;
					}
					else if(delMenu.equals("바닐라라떼")) {
						total -= 5100;
					}
					else if(delMenu.equals("카페모카")) {
						total -= 5500;
					}
					else if(delMenu.equals("레몬에이드")) {
						total -= 5000;
					}
					count --;
					
					
				}
			}
			else if(num == 3) {
				
				System.out.println("결제할 금액 :"+total +"원");
				System.out.println("지불할 금액: ");
				int money= sc.nextInt();
				if(money<total) {
					System.out.println("금액이 부족합니다");
					continue;
				}
				else {
					System.out.println("잔돈은 " + (money-total)+"원 입니다.");
					total = 0;
					for(int i = 0; i<orderList.length ; i++) {
						orderList[i]= ""; 
								
					}
					count = 0;
				}
				
			}
			else if(num == 4) {
				System.out.println("반복종료");
				break;
			}
			else {System.out.println("잘못 입력하셨습니다");
			}
			
			
			
		}
		 
		
		
	}

}
