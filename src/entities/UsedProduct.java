package entities;
import entities.Product;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class UsedProduct extends Product{
	private LocalDate manufactureDate;
	public UsedProduct(){
		super();
	};
	public UsedProduct(String name, Double price, String manufactureDate){
		super(name, price);
		this.manufactureDate = LocalDate.parse(manufactureDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	};
	public LocalDate getManufactureDate(){
		return this.manufactureDate;
	};
	public String priceTag(){
		StringBuilder priceTag = new StringBuilder();
		priceTag.append(this.name + "(used)"+ " R$"+this.price + "(Manufacture Date: "+this.manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+")");
		return priceTag.toString();
	}
}