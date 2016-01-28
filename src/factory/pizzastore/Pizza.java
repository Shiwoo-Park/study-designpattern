package factory.pizzastore;

import java.util.ArrayList;
import java.util.List;



public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	public abstract void desc();
	
	public void prepare(){
		System.out.println("Prepare : "+name);
		System.out.println("Tossing dough : "+dough);
		System.out.println("Adding sauce : "+sauce);
		System.out.println("Adding Toppings");
		for(int i=0; i<toppings.size(); i++){
			System.out.println(toppings.get(i));
		}
	}
	public void bake(){
		System.out.println("Bake for 25 min at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("Place the pizza in the box");
	}
	public String getName(){
		return name;
	}
}
