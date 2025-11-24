package product;

public class ProductService implements ProductServiceInterface {
	
	// controller <-> service <-> DAO <-> DB
	// controller에서 처리된 객체를 받아 각 DAO로 전달 (객체의 해체 / 조립)
	
	//DAOInterface 연결 후 생성자에서 객체 생성
	private ProductDAOInterface pdao;
	
	public ProductService() {
		pdao = new ProductDAO(); // DAO 구현체 연결
	}
	
	// controller에서 오는 처리를 맡아서 함
	
	

}
