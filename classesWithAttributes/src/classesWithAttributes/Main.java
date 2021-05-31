package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(id: 1,name:"Laptop",description: "Asus Laptop", price:3000, stockAmount:2, renk: "Siyah");
		product.set_name("Laptop");
		product.set_id(1);
		product.set_description("Asus Laptop");
		product.set_price(5000);
		product.set_stockAmount(3);
		

		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.get_kod());
		
	}

}
