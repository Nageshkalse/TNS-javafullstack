package org.tns.cap.c2c.oops;

public class fooditems {
		//state or properties, var
		String name;
		double price;
		String category;
		
		//method or member func or func
		void display()
		{
			System.out.println("Food name : "+name);
			System.out.println("Price "+price);
			System.out.println("Category "+category);
			System.out.println("-------------------");
		}
		
		
		public static void main(String[] args) {
			
			fooditems obj1=new fooditems();
			obj1.name="Veg Burger";
			obj1.price=250;
			obj1.category="Fast Food";
			
			
			fooditems obj2=new fooditems();
			obj2.name="Panner Pizza";
			obj2.price=300;
			obj2.category="Italian";
			
			fooditems obj3=new fooditems();
			obj3.name="Cold coffee";
			obj3.price=300;
			obj3.category="Beverage";
			
			fooditems obj4=new fooditems();
			obj4.name="Pan Cake";
			obj4.price=300;
			obj4.category="Deserts";
			
			
			obj1.display();
			obj2.display();
			obj3.display();
			obj4.display();
			
			
			
		}

	}

