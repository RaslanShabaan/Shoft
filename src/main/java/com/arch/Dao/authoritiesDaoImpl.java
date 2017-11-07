
package com.arch.Dao;

import com.arch.Entities.Post;
import com.arch.Entities.authorities;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class authoritiesDaoImpl implements authoritiesDao {

	public List<authorities> vv;

	@Autowired
    private SessionFactory sessionFactory;

	@Override
    public String Insertauthorities(authorities authorities) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(authorities);
        transaction.commit();
        session.flush(); //address will not get saved without this

        return "Doen";
    }

	@Override
    public String Deleteauthorities(String username) {

	      Session session = sessionFactory.openSession();
	      Transaction transaction = session.beginTransaction();

	      Query query = session.createQuery("delete from authorities where id:=id");
	      query.setParameter("id", username);
	      query.executeUpdate();
	      transaction.commit();

	      session.flush(); //address will not get saved without this
  
        return "Doen";
    }
	
	
	@Override
    public String Updateauthorities(authorities authorities) {

	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(authorities);
        transaction.commit();

        session.flush(); //address will not get saved without this

        return "Doen";
    }

	@Override
    public authorities Selectauthorities(String username) {
		
		Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        authorities  authorities= (authorities) session.createCriteria(authorities.class).add(Restrictions.eq("id", username)).uniqueResult();
        transaction.commit();
        session.flush(); //address will not get saved without this
        return authorities;


	}

	@Override
    public List<authorities> SelectALLauthorities() {
    	vv=new ArrayList<authorities>();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
       
       vv= session.createCriteria(authorities.class).list();
        transaction.commit();
        session.flush(); //address will not get saved without this

    		return vv;
    }
}
