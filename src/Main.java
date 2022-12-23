import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Integer quantityProducts;
		System.out.print("QUANTIDADE DE PRODUTOS: ");
		quantityProducts = sc.nextInt();
		List<Product> products = new ArrayList<>();
		sc.nextLine();
		for(int i = 0; i<quantityProducts; i++){
			String name, productType, data;
			Double price;
			Double customsFee;

			System.out.print("Comum, usado ou importado (Comum/c - Usado/u - Importado/i): ");
			productType = sc.nextLine().toLowerCase();
			switch(productType){
				case "comum":
					System.out.print("DIGITE O NOME DO PRODUTO: ");
					name = sc.nextLine();
					System.out.print("DIGITE O PREÇO DO PRODUTO: ");
					price = sc.nextDouble();
					products.add(new Product(name, price));
					sc.nextLine();
					break;
				case "c":
					System.out.print("DIGITE O NOME DO PRODUTO: ");
					name = sc.nextLine();
					System.out.print("DIGITE O PREÇO DO PRODUTO: ");
					price = sc.nextDouble();
					products.add(new Product(name, price));
					sc.nextLine();
					break;
				case "usado":
					System.out.print("DIGITE O NOME DO PRODUTO: ");
					name = sc.nextLine();
					System.out.print("DIGITE A DATA(dd/MM/aaaa): ");
					data = sc.nextLine();
					System.out.print("DIGITE O PREÇO DO PRODUTO: ");
					price = sc.nextDouble();
					products.add(new UsedProduct(name, price, data));
					sc.nextLine();
					break;
				case "u":
					System.out.print("DIGITE O NOME DO PRODUTO: ");
					name = sc.nextLine();
					System.out.print("DIGITE A DATA(dd/MM/aaaa): ");
					data = sc.nextLine();
					System.out.print("DIGITE O PREÇO DO PRODUTO: ");
					price = sc.nextDouble();
					products.add(new UsedProduct(name, price, data));
					sc.nextLine();
					break;
				case "importado":
					System.out.print("DIGITE O NOME DO PRODUTO: ");
					name = sc.nextLine();
					System.out.print("DIGITE O PREÇO DO PRODUTO: ");
					price = sc.nextDouble();
					System.out.print("DIGTE O PREÇO DA TAXA DE IMPORTAÇÃO: ");
					customsFee = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFee));
					sc.nextLine();
					break;
				case "i":
					System.out.print("DIGITE O NOME DO PRODUTO: ");
					name = sc.nextLine();
					System.out.print("DIGITE O PREÇO DO PRODUTO: ");
					price = sc.nextDouble();
					System.out.print("DIGTE O PREÇO DA TAXA DE IMPORTAÇÃO: ");
					customsFee = sc.nextDouble();
					products.add(new ImportedProduct(name, price, customsFee));
					sc.nextLine();
					break;
				default:
					System.out.println("Tipo de produto inválido. Rode novamente o programa.");
			}

		}
		System.out.println("PRICE TAGS: ");
		for(Product produto : products){
			System.out.println(produto.priceTag());
		}

		sc.close();
	}
}
