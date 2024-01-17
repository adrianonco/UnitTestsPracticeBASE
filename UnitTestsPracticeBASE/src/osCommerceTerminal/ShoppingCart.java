package osCommerceTerminal;

import java.util.LinkedList;
import java.util.List;

//A shopping cart represents a container for adding product items, and computes the total price
public class ShoppingCart {
	
	//The list of items
	List<ProductItem> productItems;
	
	//The name of the shopping cart
	String shoppingCartName;
	
	public ShoppingCart(String shoppingCartName) {
		productItems = new LinkedList<ProductItem>();
		this.shoppingCartName=shoppingCartName;
	}
	
	public void addProductItem(ProductItem productItem) {
		productItems.add(productItem);
	}
	
	public void removeProductItem(int index) {
		productItems.remove(index);
	}
	
	public int numberOfItems() {
		return productItems.size();
	}
	
	public Price totalPrice() {
		
		double priceInDefaultCurrency=0;
	
		for (ProductItem item : productItems) {
		    priceInDefaultCurrency+=item.getQuantity()*item.getSingleItemPriceInDefaultCurrency();
		}
		
		Price result=new Price(priceInDefaultCurrency, Configuration.getInstance().getDefaultCurrency());
		return result;
		
	}
	
	


	
}
