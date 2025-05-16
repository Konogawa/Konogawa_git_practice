package com.example.demo.git_practice;

public class UseCar {

	public static void main(String[] args) {
		Car cl;
		cl = new Car();

		cl.maker = "HONDA";
		cl.displacement = 2000;
		cl.color = "青";

		cl.start();
		cl.curve();
		cl.stop();

		System.out.println("clのメーカーは" + cl.maker + "です");
		System.out.println("clの色は" + cl.color + "です");

	}

}
