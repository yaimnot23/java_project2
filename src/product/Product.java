package product;

public class Product {

	// 제품 객체 클래스
	private int pno; // DB에서 자동생성
	private String pname;
	private int price;
	private String regdate; // DB에서 자동생성
	private String madeby;
	
	// 생성자
	public Product() {
	}
	
	// 등록용 생성자
	public Product(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
	
	// 리스트 보기
	
	public Product(String pname, int price, String regdate, int pno) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.regdate = regdate;
	}
	
	// 상세 페이지
	public Product(int pno, String pname, int price, String regdate, String madeby) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.regdate = regdate;
		this.madeby = madeby;
	}
	
	// 수정
	public Product( int pno, String pname,  int price, String madeby) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}
	
	// println 확인용
	public void print() {
		System.out.println("제품 번호(등록일): " + pno + " (" + regdate + ")");
		System.out.println("제품 이름: " + pname);
		System.out.println("제품 가격: " + price);
		System.out.println("상세정보: ");
		System.out.println("제조사: " + madeby);
	}

	
	// getter / setter
	
	public int getPno() {
		return pno;
	}



	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}

}
