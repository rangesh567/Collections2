package collection2;

public class Bike {
	private int regNo;
	private String brand;
	private String color;
	private int price;
	
	public void setRegNo(int regNo) {
		this.regNo=regNo;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Bike(int regNo,String brand,String color,int price) {
		this.regNo=regNo;
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public String toString() {
		return regNo+brand+color+price;
	}
	

}
