package pl.musicstore;



import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
//public interface ProductRepository extends JpaRepository<Product, Long> {
public class ProductRepository{
	@Autowired ProductDeo productDeo;
	
	//Product findById(int productId);
	//Product findByName(String name);
	//Product findByPrice(Double price);
	//Product findByAuthor(String author);
	//Collection <Product> findByCategory(String category);
	public Collection <Product> findAll(){
		return this.productDeo.findAll();
	}

	 public void removeProductById(int productId){
		 this.productDeo.removeProductById(productId);
	 }

	public Product findByName(String name) {
		
		return this.productDeo.findByName(name);
	}

	public Product findById(int productId) {
		
		return this.productDeo.findById(productId);
	}

	public Product findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product findByPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Product> findByCategory(String category) {
		
		return this.productDeo.findByCategory(category);
	}

	//List<ProductIdenty> findAllProductsIdenty();
}
