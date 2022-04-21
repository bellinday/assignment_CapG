package assignments;
import java.util.*;
class Product {
private Integer id;
private String name;
private double price;
public Product(Integer id, String name, Double price) {
	this.id=id;
	this.name=name;
	this.price=price;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String toString() {
	return("Product"+"{"+"id="+id+", "+"name="+name+", "+"price="+price+"}");
}
}
class Implementation2{
	public Map<String, List<Product>> getProductName(List<Product> products){
		Map<String, List<Product>> m = new HashMap<>();
		List<Product> l = new ArrayList();
		for(Product i : products) {
			if(i.getPrice()>=20)
			{
				l.add(i);
				m.put(i.getName(), l);
			}
			
		}
		return m;
	}
	public Map<String, Double> getSum(List<Product> products){
		Map<String, Double> map1 = new HashMap<>();
		for(Product i :products) {
			map1.put(i.getName(), i.getPrice());
		}
		return map1;
	}
}
class question28{
	public static void main(String[] args) {
	Product pr5 = new Product(1,"Bruchotte", 5.0);
	Product pr6 = new Product(4,"Banana", 1305.0);
	List<Product> pr = Arrays.asList(pr5, pr6);
	Implementation2 i = new Implementation2();
	System.out.println(i.getProductName(pr));
	System.out.println(i.getSum(pr));
}
}


