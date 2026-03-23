package org.tns.cap.c2tc.javabasic;

public class datatypedemo {


		    public static void main(String[] args) {

		        // Primitive data types
		        int orderId = 101;
		        double price = 299.99;
		        boolean isDelivered = false;
		        char rating = 'A';
		        float deliveryDistance = 5.3f;
		        long deliveryBoyNumber = 9741333955L;
		        byte deliveryTime = 45;
		        short restaurantId = 12;

		        // Non-primitive data types
		        String customerName = "Nagesh";   // String
		        String[] foodItems = {"Burger", "Fries", "Coke"};   // Array

		        System.out.println("Order Summary");
		        System.out.println("Customer Name: " + customerName);
		        System.out.println("Order ID: " + orderId);
		        System.out.println("Restaurant ID: " + restaurantId);
		        System.out.println("Delivery Boy Number: " + deliveryBoyNumber);

		        System.out.println("Food Items:");
		        for(String item : foodItems) {
		            System.out.println(item);
		        }

		        System.out.println("Total Price: " + price);
		        System.out.println("Delivery Distance: " + deliveryDistance);
		        System.out.println("Expected Time: " + deliveryTime);
		        System.out.println("Rating: " + rating);
		        System.out.println("Delivered: " + isDelivered);
		    }
		}

	


