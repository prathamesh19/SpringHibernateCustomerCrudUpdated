package com.prathamesh.hibernateutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static SessionFactory sf;
	static Session s;
	static Transaction tr;
	
	
	public static SessionFactory getSessionFactory(){	
     if(sf!=null){
		Configuration cfg=new Configuration();
		sf=cfg.buildSessionFactory();
     }
	return sf;
		
	}
	
	public static Session getSession(){
	if (sf!=null && s!=null){
		s=sf.openSession();
	}
		
		return s;
	}
	
	public static Transaction getTransaction(){
		s.beginTransaction();
		return tr;
		
	}
	
	public static void sessionFlushTransactionCommit(){
		s.flush();
		tr.commit();
		
	}
}
