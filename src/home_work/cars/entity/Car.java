package home_work.cars.entity;

public class Car {

	private String carBrand;
	private int yearManufac;
	private double horsePower;
	private double engineCapacity;
	private String color;
	private int amountWheels;

	public Car(String carBrand, int yearManufac, double horsePower, double engineCapacity, String color,
			int amountWheels) {

		this.carBrand = carBrand;
		
		if (yearManufac > 1900 & yearManufac <= 2017) {
			this.yearManufac = yearManufac;

		} else {
			System.out.println("Wrong year of manucature");
		}

		if (horsePower > 0) {
			this.horsePower = horsePower;

		} else {
			System.out.println("Wrong hoursepower amount");

		}
		
		if (engineCapacity > 0) {
			this.engineCapacity = engineCapacity;

		} else {
			System.out.println("Wrong engine capacity amount");

		}
		
		this.color = color;
		
		if (amountWheels >= 4 ) {
			this.amountWheels = amountWheels;
		} else {
			System.out.println("We don't calc motocycles, sorry");

		}
		
	}

	public Car(int yearManufac, double horsePower, double engineCapacity, String color, int amountWheels) {
		
		if (yearManufac > 1900 & yearManufac <= 2017) {
			this.yearManufac = yearManufac;

		} else {
			System.out.println("Wrong year of manucature");
		}

		if (horsePower > 0) {
			this.horsePower = horsePower;

		} else {
			System.out.println("Wrong hoursepower amount");

		}
		
		if (engineCapacity > 0) {
			this.engineCapacity = engineCapacity;

		} else {
			System.out.println("Wrong engine capacity amount");

		}
		
		this.color = color;
		
		if (amountWheels >= 4 ) {
			this.amountWheels = amountWheels;
		} else {
			System.out.println("We don't calc motocycles, sorry");

		}
	}

	public String getCarBrand() {
		return carBrand;
	}

	public int getyearManufac() {
		return yearManufac;
	}

	public double getHorsePower() {
		return horsePower;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public String getColor() {
		return color;
	}

	public int getAmountWheels() {
		return amountWheels;
	}

	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display() {

		String res;
		
		if (carBrand != null) {
			res = "Car: " + carBrand;
		} else {
			res = "Car handmade";
		}
		
		res =res+ ", Year of manucature: " + yearManufac + ", Power capacity: " + horsePower +"HP"+ 
				", Engine Capacity: " + engineCapacity + "L" + ", Color: " + color + ", Amount wheels: " + amountWheels;
		
		System.out.println(res);
		System.out.println("");

	}

}
