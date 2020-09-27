package com.app.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {
	@Id
	@Column(name = "Order_Id")
	private int orderId;
	
	@Column(name = "Customer_Name")
	private String userName;

	@Column(name = "Phone_No")
	private long phoneNo;

	@Column(name = "Address")
	private String address;

	@Column(name = "Quantity")
	private int quantity;

	@Column(name = "B_Id")
	private int bookId;

	@Column(name = "Order_Date")
	private String oredrDate;

	public OrderDetails() {
		Random rad = new Random();
		this.orderId = rad.nextInt(10000);
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		this.oredrDate = df.format(d);
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", userName=" + userName + ", phoneNo=" + phoneNo + ", address="
				+ address + ", quantity=" + quantity + ", bookId=" + bookId + ", oredrDate=" + oredrDate + "]";
	}

	public OrderDetails(String userName, long phoneNo, String address, int quantity, int bookId) {
		super();
		this.userName = userName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.quantity = quantity;
		this.bookId = bookId;

		Random rad = new Random();
		this.orderId = rad.nextInt(100);
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		this.oredrDate = df.format(d);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId() {
		Random rad = new Random();
		this.orderId = rad.nextInt(100);
	}

	public String getOredrDate() {
		return oredrDate;
	}

	public void setOredrDate() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		this.oredrDate = df.format(d);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

}
