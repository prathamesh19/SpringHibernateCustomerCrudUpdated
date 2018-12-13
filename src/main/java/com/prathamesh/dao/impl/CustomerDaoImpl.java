package com.prathamesh.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prathamesh.dao.CustomerDao;
import com.prathamesh.entity.Customer;

public class CustomerDaoImpl implements CustomerDao{
public SessionFactory dbsf;
	
	List<Customer> l=new ArrayList<Customer>();
public SessionFactory getDbsf() {
	return dbsf;
}

public void setDbsf(SessionFactory dbsf) {
	this.dbsf = dbsf;
}

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub		
	Session s=dbsf.openSession();
	Transaction tr=s.beginTransaction();
	s.save(customer);
	s.flush();
	tr.commit();
	s.close();
	
	return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session session = dbsf.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(getCustomer(customerId));
		session.flush();
		transaction.commit();
		session.close();
		return true;		
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		Session session = dbsf.openSession();
		Customer c = (Customer) session.get(Customer.class,customerId);
		session.close();
		return c;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		Session s=dbsf.openSession();
		
		
		l = s.createQuery("from Customer").list();
		s.close();
		return l;
		
	}

}
