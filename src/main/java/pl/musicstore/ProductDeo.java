package pl.musicstore;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Repository
public class ProductDeo {
	private static Map <Integer,Product> products;
	static{
		
		products= new HashMap <Integer,Product>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = -8027477682904676488L;

			{
			put(1,new Product(1,"Hello","Adele","pop",27.99));
			put(2,new Product(2,"Thisisis","Adele","pop",27.99));
			put(3,new Product(3,"Divide","Ed Sherean","pop",18.99));
			put(4,new Product (4,"Deal with","ROCKYA","rap",14.99));
			put(5,new Product (5,"This is Acting","Sia","pop",17.99));
			put(6,new Product (6,"Closer","Nine Inch Nails","industrial",37.99));
			put(7,new Product (7,"Closer","Closer","rock",27.99));
			put(8,new Product (8,"Blue","Blake","jazz",17.99));
			}
		
		};
		
		
	}

public void removeProductById(int productId) {
	products.remove(productId);
	
}

public Collection <Product> findAll() {
	System.out.println(products.values());
	return products.values();
	
}

public Product  findByName(String name) {
	Collection < Product > collection= products.values();
	
	Object[] array=collection.toArray();
	//collection.clear();
	int id=0;
	for(int i=0; i<collection.size();i++){
		Product prod=(Product) array[i];
		if(prod.getName().equals(name)){
			id=prod.getId();
			//prod=products.get(id);
		//collection.add(prod);
		//System.out.println(prod+"");
		}
	}
	//System.out.println(collection+"jek");
		return products.get(id);
}
public Product findById(int id) {
	
	return products.get(id);
}

public Collection<Product>  findByCategory(String category) {
	Collection < Product > collection= products.values();
	List<Product>productss=new ArrayList<Product>();
	Object[] array=collection.toArray();
	int id=0;
	for(int i=0; i<collection.size();i++){
		Product prod=(Product) array[i];
		if(prod.getCategory().equals(category)){
			id=prod.getId();
		productss.add(products.get(id));
		}
	}
	
	collection.clear();
	for(int i=0; i<productss.size(); i++){
		collection.add(productss.get(i));
	}
		return collection;
}
}
