package com.example.demo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import com.pup.tuna.demo.student;
@Component
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s=new student();
		s.setRno(123);
		s.setName("JITHENDRA");
		s.setDep("REX");
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println(s.toString());
		
	}

}
