package product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO implements ProductDAOInterface {
	
	// service <-> DAO <-> DB
	// DBConnection <-> DAO
	// DB에 접근하는 객체를 처리
	
	// DB 연결 객체
	private Connection conn;
	
	// sql 구문 실행시키는 역할을 하는 객체
	private PreparedStatement pst;
	
	// sql 쿼리문 저장 스트링
	private String query="";
	
	public ProductDAO() {
		// DB 연결(싱글톤)
		
	}

}
