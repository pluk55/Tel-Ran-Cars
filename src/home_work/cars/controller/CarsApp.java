package home_work.cars.controller;

import home_work.cars.entity.Car;

public class CarsApp {

	public static void main(String[] args) {

		Car lada = new Car("Lada", 1993, 80, 1.6, "Baklagan", 4);
		lada.display();
		
		Car garag = new Car(2017, 999, 12, "Black", 6);
		garag.display();
	
	}


}
