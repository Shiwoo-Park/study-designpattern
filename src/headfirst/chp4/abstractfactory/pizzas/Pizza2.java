package headfirst.chp4.abstractfactory.pizzas;

import headfirst.chp4.abstractfactory.ingredients.Cheese;
import headfirst.chp4.abstractfactory.ingredients.Dough;
import headfirst.chp4.abstractfactory.ingredients.Sauce;
import headfirst.chp4.abstractfactory.ingredients.Veggies;

public abstract class Pizza2 {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	
	public abstract void prepare();
	
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
	public void setName(String name) {
		this.name = name;
	}

}
