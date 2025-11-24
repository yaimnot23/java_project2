package board;

public class Board {
	private int num;
	private String title;
	private String writer;
	private String contents;
	private String regDate;
	
	// 생성자
	public Board(int num, String title, String writer, String contents, String regDate) {
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.regDate = regDate;
	}
	
	// getter, setter

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", writer=" + writer + ", contents=" + contents + ", regDate="
				+ regDate + "]";
	}
	
	public String printDetail() {
		return "게시글 번호: " + num + "\n제목: " + title + "\n작성자: " + writer + "\n내용: " + contents + "\n등록일: " + regDate;
	}
	

}
