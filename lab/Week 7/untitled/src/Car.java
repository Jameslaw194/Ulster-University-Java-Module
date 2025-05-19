import java.text.NumberFormat;
import java.util.*;

public class Car
{	// properties
	private static final int CURRENT_YEAR = 2011;
	private static int totalNum = 0;
	
	private String model;
	private int engSize;
	private int year;
	private double newPrice;
	private double tax;
	private double value;
	
	//3 constructors to be completed

	public Car(String model, int engSize, int year, double newPrice, double value) {
		this.model = model;
		this.engSize = engSize;
		this.year = year;
		this.newPrice = newPrice;
		this.value = value;
		this.tax = roadTax();
		totalNum++;
	}


	public Car(String model, double engSizeLitres, int year, double newPrice, double value) {
		this(model, (int) (engSizeLitres * 1000), year, newPrice, value);
	}


	public Car() {
		this("Unknown", 1000, CURRENT_YEAR, 0.0, 0.0);
	}


	private double roadTax()
	{
		if (engSize > 1200){
			tax = 100.00;
		}
		if (engSize > 1200 && engSize < 2000){
			tax = 150.00;
		}
		if (engSize > 2000){
			tax = 200.00;
		}

		return this.tax;
	} 

	private double currentValue()
	{
		return this.value;
	}

	public void displayDetails()
	{
		System.out.println("Model: " + model + "\n" +
				"Year: " + year + "\n" +
				"Engine Capacity: " + engSize + "\n" +
				"Road tax: " + tax + "\n" +
				"Current value: " + value);
	}
	
	public String getModel()
	{
		return this.model;
	}

	public void setModel(String inModel)
	{
		this.model = inModel;
	}

	public int getEngSize()
	{
		return this.engSize;
	}

	public void setEngSize(int inEngSize)
	{
		this.engSize = inEngSize;
	}

	public int getYear()
	{
		return this.year;
	}

	public void setYear(int inYear)
	{
		this.year = inYear;
	}

	public double getNewPrice()
	{
		return this.newPrice;
	}

	public void setNewPrice(double inNewPrice)
	{
		this.newPrice = inNewPrice;
	}

	public static int getTotalNum()
	{
		return Car.totalNum;
	}	
	
}
