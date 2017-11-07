package com.arch.Dao;

import com.arch.Entities.Post;

import com.arch.Entities.users;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class usersDaoImpl implements usersDao {

	public List<users> vv;

	@Autowired
    private SessionFactory sessionFactory;

	@Override
    public String Insert(users users) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(users);
        transaction.commit();
        session.flush(); //address will not get saved without this

        return "Doen";

    }

	@Override
    public String Delete(String username) {

	      Session session = sessionFactory.openSession();
	      Transaction transaction = session.beginTransaction();

	      Query query = session.createQuery("delete from users where id:=id");
	      query.setParameter("id", username);
	      query.executeUpdate();
	      transaction.commit();

	      session.flush(); //address will not get saved without this

        return "Doen";
    }
	
	@Override
    public String Update(users users) {

		
	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(users);
        transaction.commit();

        session.flush(); //address will not get saved without this

        return "Doen";
    }

	@Override
    public users Select(String username) {
  
		Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        users users= (users) session.createCriteria(users.class).add(Restrictions.eq("id", username)).uniqueResult();
        transaction.commit();
        session.flush(); //address will not get saved without this
        return users;

    }

	@Override
    public List<users> SelectAllUsers() {
    	vv=new ArrayList<users>();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
       
       vv= session.createCriteria(users.class).list();
        transaction.commit();
        session.flush(); //address will not get saved without this

    	return vv;
    	
    }

	@Override
	public users SelectByVcode(String V_Code) {

		Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
       users users= (users) session.createCriteria(users.class).add(Restrictions.eq("V_Code", V_Code)).uniqueResult();
        
        transaction.commit();
        session.flush(); //address will not get saved without this
        return users;

	}
	
}
