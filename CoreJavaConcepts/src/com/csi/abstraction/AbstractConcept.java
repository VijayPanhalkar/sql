package com.csi.abstraction;

abstract class Vehicle {

	abstract void run();

	public Vehicle() {

		System.out.println("hello");
	}

}

public class AbstractConcept {

	public static void main(String[] args) {
		/*
		 * V c = new Car();
		 * 
		 * Vehicle v= new Bus(); Truck t=new Truck(); t.run(); c.run(); b.run();
		 */
		/*
		 * Vehicle v= new Bus(); v.run(); Vehicle v1= new Car(); v.run();
		 * Vehicle v2= new Truck(); v.run();
		 */
		/*Vehicle v;
		v = new Bus();
		v = new Truck();
		v = new Car();
		v.run();*/
		
		Vehicle v=new Bus();
		v.run();
		Vehicle v1=new Truck();
		v1.run();
		Vehicle v2=new Car();
		v2
		
		.run();
		

	}
	

}
