package entities;
public class ImportedProduct extends Product{

	private Double customsFee;
	public ImportedProduct(){
		super();
	};
	public ImportedProduct(String name, Double price, Double customsFee){
		super(name, price);
		this.customsFee = customsFee;
	};
	public Double getCustomsFee(){
		return this.customsFee;
	};
	public Double totalPrice(){
		return price+customsFee;
	};
	public String priceTag(){
		StringBuilder priceTag = new StringBuilder();
		priceTag.append(this.name + "R$" + this.totalPrice() + "(CUSTOMS FEE: "+ "R$ "+ this.customsFee + ")");
		return priceTag.toString();
	}
}