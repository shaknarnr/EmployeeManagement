package shanky.Day_4_Predicate;

public class Car {
 
   String name;
   String price;
   String color;
   
   
public Car(String name, String price, String color) {
	super();
	this.name = name;
	this.price = price;
	this.color = color;
}


public String getName() {
	return name;
}


public String getPrice() {
	return price;
}


public String getColor() {
	return color;
}


@Override
public String toString() {
	return "Car [name=" + name + ", price=" + price + ", color=" + color + "]";
}


   
   
   
   
}
