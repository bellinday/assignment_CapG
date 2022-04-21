package assignments;
import java.util.*;
class Customer1{
	private String name;
	private int age;
	public Customer1(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return("Customer"+"{"+"name="+name+","+"age="+age+"}");
	}
}
class Implementation1{
	public String withDelimeters(List<Customer1> customerList) {
		String str="";
		for(Customer1 i : customerList) {
			str= str+"Customer1"+"{"+"name="+i.getName()+", "+"age="+i.getAge()+"}"+"@";
		}
		return(str);
	}
	public List<Customer1> sortCustomerList(List<Customer1> customersList){
		class sortCustomersByName implements Comparator<Customer1>{
			public int compare(Customer1 a1, Customer1 b) {
				return a1.getName().compareTo(b.getName());
			}
		}
		Collections.sort(customersList,new sortCustomersByName());
		return customersList;
	}
	
}
class question27{
	public static void main(String[] args) {
		List<Customer1> customerList = Arrays.asList(new Customer1("Tom",30), new Customer1("Steve", 31), new Customer1("Peter", 34), new Customer1("Simon", 23));
		Implementation1 i = new Implementation1();
		String s = i.withDelimeters(customerList);
		s=s.substring(0, s.lastIndexOf("@"));
		List<Customer1> l = i.sortCustomerList(customerList);
		System.out.println(s);
		System.out.println(l);
		
	}
}

