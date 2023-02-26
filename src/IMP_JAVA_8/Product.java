package IMP_JAVA_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

 class Product1 {
	
	int id;
	String name;
	float price;
	
	public Product1(int id,String name,float price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
		
	}

//	@Override
//	public String toString() {
//		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
//	}
	
	}

public class Product{
	
	public static void main(String[] args) {
		
		List <Product1> li=new ArrayList<Product1>();
		
		li.add(new Product1(101,"Krishna", 200));
		li.add(new Product1(102, "Rahul", 400f));
		li.add(new Product1(103, "Sadhna", 500));
		
		
		//System.out.println(li);
		System.err.println("Shorting String ............");
		
		// implementing lambda expression
		
		Collections.sort(li,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product1 p:li) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		// using lambda to filter data 
		System.err.println("Using Filleter Data............");
		 
		Stream <Product1> st=li.stream().filter(k->k.price>300);
		
		 st.forEach(Product ->System.out.println(Product.id+" "+Product.name+" "+Product.price));
		
	}
	
	
	
}
