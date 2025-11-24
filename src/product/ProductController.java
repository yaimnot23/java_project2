package product;

import java.util.Scanner;

public class ProductController {
	
	// main 처리를 하는 컨트롤러
	// controller <-> service <-> DAO <-> DB
	
	// 인터페이스 변수로 구현체 연결
	
	private Scanner scan;
	private boolean flag; // 종료 플래그
	private ProductServiceInterface psv; // service 인터페이스
	
	public ProductController() {
		scan = new Scanner(System.in);
		psv = new ProductService(); // 구현 클래스와 연결
		flag = true; // 실행상태
		printMenu(); // 메뉴 출력
		
	}

	private void printMenu() {
		// 메뉴 생성
		while(flag) {
			System.out.println("Product Management");
			System.out.println("1. Add Product");
			System.out.println("2. View Products");
			System.out.println("3. Update Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Exit");
			System.out.print("Select an option: ");
			
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				// Add product
				break;
			case 2:
				// View products
				break;
			case 3:
				// Update product
				break;
			case 4:
				// Delete product
				break;
			case 5:
				// Exit
			case 6:
				flag = false;
				System.out.println("Exiting the program.");
			default: System.out.println("Invalid option. Please try again.");
				break;
			}
		}
		
	}

}
