package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub test to github2
		Scanner scan = new Scanner(System.in);
		BoardInterface manager = new BoardController();
		
		int menu = 0;
		
		do {
			System.out.println();
			System.out.println("게시판 프로그램");
			System.out.println("1. 추가 2. 리스트 3. 상세보기 4. 수정 5. 삭제 6. 파일로 저장 0. 종료");
			System.out.println("메뉴 선택 : ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				manager.addBoard(scan);
				break;
			case 2:
				manager.printBoard();
                break;
			case 3:
				manager.searchBoard(scan);
                break;
			case 4:
				manager.modifyBoard(scan);
                break;
			case 5:
				manager.removeBoard(scan);
                break;
			case 6:
				manager.fileBoard();
                break;
			case 7:
                System.out.println("프로그램 종료");
                break;
            default:
            	System.out.println("잘못된 메뉴 선택입니다.");
            	
			}
		}	while(menu != 0);
		scan.close();
		
	}

}
