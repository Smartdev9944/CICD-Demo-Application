package com.aws.cicd.example;






public class Order {

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Order(int id, String name, int quantity, long price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	private int id;
    private String name;
    private int quantity;
    private long price;
}
