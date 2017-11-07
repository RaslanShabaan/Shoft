package com.arch.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.arch.Entities.Register;

@Transactional
@Component
public class RegisterDaoImpl implements RegisterDao{

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void InsertRegister(Register register) {
		
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(register);
        transaction.commit();
        session.flush(); //address will not get saved without this

	}

	@Override
	public Register SelectRegister(String Mail) {

		 	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Register register= (Register) session.createCriteria(Register.class).add(Restrictions.eq("id", Mail)).uniqueResult();
        transaction.commit();
        session.flush(); //address will not get saved without this
        return register;

	}

	@Override
	public void DeleteRegister(String Mail) {
		
	      Session session = sessionFactory.openSession();
	      Transaction transaction = session.beginTransaction();

	      Query query = session.createQuery("delete from User where id:=id");
	      query.setParameter("id", Mail);
	      query.executeUpdate();
	      transaction.commit();

	      session.flush(); //address will not get saved without this

	}

	@Override
	public void UpdateRegister(Register register) {
		
	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(register);
        transaction.commit();

        session.flush(); //address will not get saved without this

	}

}
