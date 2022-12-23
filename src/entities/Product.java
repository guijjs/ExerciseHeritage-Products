package entities;
public class Product{
	protected String name;
	protected Double price;

	//Default constructor.
	public Product(){

	};
	public Product(String name, Double price){
		this.name = name;
		this.price = price;
	};
	public String priceTag(){
		StringBuilder priceTag = new StringBuilder();
		priceTag.append(this.name + "R$ " + this.price);
		return priceTag.toString();
	};
}