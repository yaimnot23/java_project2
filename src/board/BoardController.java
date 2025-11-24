package board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardController implements BoardInterface {

	private List<Board> list = new ArrayList<>(); // 게시글 저장
	private int count = 1; // 게시글 번호 자동 생성 변수

	@Override
	public void addBoard(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("게시글 등록");
		System.out.print("제목: ");
		String title = scan.next();
		System.out.print("작성자: ");
		String writer = scan.next();
		System.out.print("내용: ");
		String contents = scan.next();

		// 날짜
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String regDate = sdf.format(date);

		Board b = new Board(count++, title, writer, contents, regDate);
		list.add(b);
		System.out.println("게시글이 등록되었습니다.");

	}

	@Override
	public void printBoard() {
		// TODO Auto-generated method stub
		System.out.println("게시글 목록");
		System.out.println("번호\t제목\t작성자\t날짜");
		System.out.println("--------------------------------");
		if (list.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}
		for (Board b : list) {
			System.out.println(b); // Board의 toString() 호출
		}

	}

	@Override

	// TODO Auto-generated method stub
	public void searchBoard(Scanner scan) {
		System.out.println("게시글 상세 검색");
		System.out.print("조회할 게시글 번호: ");
		int num = scan.nextInt();

		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() == num) {
				index = i;
				System.out.println(list.get(i).printDetail());
				break;
			}
		}
		if (index == -1) {
			System.out.println("해당 번호의 게시글이 없습니다.");
		}
	}

	@Override
	public void modifyBoard(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("게시글 수정");
		System.out.print("수정할 게시글 번호: ");
		int num = scan.nextInt();

		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() == num) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("새로운 제목: ");
			String title = scan.next();
			System.out.println("새로운 내용: ");
			String contents = scan.next();

			Board b = list.get(index);
			b.setTitle(title);
			b.setContents(contents);
			System.out.println("게시글이 수정되었습니다.");
		} else {
			System.out.println("해당 번호의 게시글이 없습니다.");
		}

	}

	@Override
	public void removeBoard(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("게시글 삭제");
		System.out.print("삭제할 게시글 번호: ");
		int num = scan.nextInt();

		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() == num) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			list.remove(index);
			System.out.println("게시글이 삭제되었습니다.");
		} else {
			System.out.println("해당 번호의 게시글이 없습니다.");
		}

	}

	@Override
	public void fileBoard() {
		// TODO Auto-generated method stub
		System.out.println("게시글 파일로 저장(추후 구현)");
		// 파일 저장 기능은 추후 구현 예정

	}

}
