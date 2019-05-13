package com.semihdizdar.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.semihdizdar.hibernate.*;

public class main {
	
	public static void main(String args[]) {
		
		personel p1 = new personel();
		p1.setPersonelid(2);
		p1.setPersonelAdi("emrah");
		p1.setPersonelSoyadi("erdoðan");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Transction baþlatýldý");
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
		System.out.println("Transaction tamamlandý.");
		System.out.println("Veri kaydedildi.");
		

		
	}

}
