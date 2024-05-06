package bookmarket;

import bookmarket.controller.BookMarketController;
import bookmarket.model.BookStorage;
import bookmarket.model.Cart;
import bookmarket.view.ConsoleView;

public class BookMarket {

	public static void main(String[] args) {
		// model 생성
		BookStorage bookStorage = new BookStorage();
		Cart cart = new Cart();
		
		// view 생성
		ConsoleView view = new ConsoleView();
		
		// controller 생성 (model, view)
		BookMarketController controller = new BookMarketController(bookStorage, cart, view);
		controller.start();
		
		
	}

}
