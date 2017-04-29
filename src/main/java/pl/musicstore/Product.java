package pl.musicstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Product {
	@Id
	@GeneratedValue
	private int id;
	public Product(int i, String name, String author,String category, double d) {
		super();
		this.id = i;
		this.name = name;
		this.author = author;
		this.price = d;
		this.category=category;
	}
	public Product(){}

	private String name;
	private String author;
	private double price;
	private String category;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*public int getId(String namee) {
		int idd=0;
		if(this.name==namee){
	idd= id;}
		return idd;
	}*/
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category + "]";
	}
}
