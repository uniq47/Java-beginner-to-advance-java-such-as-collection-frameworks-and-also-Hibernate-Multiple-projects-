import java.util.ArrayList;
import java.util.List;

public class ProductClient {

	public static void main(String[] args) {
		// we are tryoign to add product objets; 
		Product pro = new Product(100,"tv", 10, 250);
		Product pro1 = new Product(101,"ac", 30, 220);
		Product pro2 = new Product(102,"microwave", 20, 240);
		
		List <Product> addProducts = new ArrayList<>();
		addProducts.add(pro);
		addProducts.add(pro1);
		addProducts.add(pro2);
		
		for(Product product : addProducts)
		{
			System.out.println(product.getPid() + "\t" + product.getPname()+"\t"+ product.getPrice()+"\t"+ product.getQty());
		}
		
		
		
	}

}
