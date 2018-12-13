package com.prathamesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author prathamesh
 *
 */

@Entity
@Table(name="CUSTOMER_INFO")
public class Customer {

@Id
private int customerId;
private String customerName;

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public Customer(int customerId, String customerName) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
