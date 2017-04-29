package pl.musicstore;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProductController {
	private final ProductRepository productRepository;
	@Autowired
	ProductController(ProductRepository productRepository){
		this.productRepository=productRepository ;
	}

	@RequestMapping(method=RequestMethod.GET, value="/products")
	Collection<Product> products(){
		return this.productRepository.findAll();
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/products/byname/{name}")
	Product productByName(@PathVariable String name){
		return this.productRepository.findByName(name);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/products/byid/{productId}")
	Product productById(@PathVariable int productId){
		return this.productRepository.findById(productId);
	}
	@RequestMapping(method=RequestMethod.GET, value="/products/byauthor/{author}")
	Product productByAuthor(@PathVariable String author){
		return this.productRepository.findByAuthor(author);
	}
	@RequestMapping(method=RequestMethod.GET, value="/products/byprice/{price}")
	Product productByPrice(@PathVariable Double price){
		return this.productRepository.findByPrice(price);
	}
	@RequestMapping(method=RequestMethod.GET, value="/products/bycategory/{category}")
	Collection<Product> productByCategory(@PathVariable String category){
		return this.productRepository.findByCategory(category);
	}
	

/*	@RequestMapping(method=RequestMethod.GET, value="/productsidenty/")
	Collection<ProductIdenty> productByIdenty(){
		return this.productRepository.findAllProductsIdenty();
	}*/
	
	@RequestMapping(method=RequestMethod.DELETE, value="/products/byid/{productId}")
	void removeProductById(@PathVariable int productId){
	 this.productRepository.removeProductById(productId);
	}
	
}
