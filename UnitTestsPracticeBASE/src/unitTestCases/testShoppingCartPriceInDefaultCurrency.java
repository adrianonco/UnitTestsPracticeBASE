package unitTestCases;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import osCommerceTerminal.ProductItem;
import osCommerceTerminal.ShoppingCart;

class testShoppingCartPriceInDefaultCurrency {

	static ShoppingCart sc1;
    static ShoppingCart sc2;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//Creamos un shopping cart
				sc1 = new ShoppingCart("MyFirstShoppingCart");
						
				//Creamos y a�adimos product items
				ProductItem p1 = new ProductItem("Camiseta", 18 , 1);
				ProductItem p2 = new ProductItem("Pantalones", 68, 1);
				sc1.addProductItem(p1);
				sc1.addProductItem(p2);
						
				
				//Creamos otro shopping cart
				sc2 = new ShoppingCart("MySecondShoppingCart");
				
				//Creamos y añadimos product items
				ProductItem p3 = new ProductItem("Blusa", 40, 2);
				ProductItem p4 = new ProductItem("Calcetines", 6, 3);
				sc2.addProductItem(p3);
				sc2.addProductItem(p4);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSimplePrice() {
		assertEquals(86, sc1.totalPrice().getAmount());
		//fail("To be implemented in class as demonstration");
	}
	
	@Test
	void testPriceWithQuantities() {
		assertEquals(98, sc2.totalPrice().getAmount());
		//To be implemented in class as demonstration");
	}
	
	@Test
	void addProductItemAndCheckPrice() {
		//Add product item
				ProductItem p5 = new ProductItem("Chaqueta", 40 , 1);
				sc1.addProductItem(p5);
		// Check price
				assertEquals(126, sc1.totalPrice().getAmount());
		// fail("To be implemented autonomously");
		
	}
	
	@Test
	void removeProductItemAndCheckPrice() {
		fail("To be implemented autonomously");
	}
	

}
