package org.tns.cap.c2tc.javabasic;

public class typecastingdemo {
	public static void main(String[] args) {
		int quantity=3;
		double priceperitem=99.5;
		double totalprice= quantity*priceperitem;
		System.out.println("total price with widening" +totalprice);
        //narrowing
		double discount=10.75;
		int rounddiscount=(int)discount;
		double finalamount=totalprice-rounddiscount;
		System.out.println("finalamount "+finalamount);
		System.out.println("rounddiscount "+rounddiscount);
		}
	

	}

