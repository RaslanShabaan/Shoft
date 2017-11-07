
package com.arch.Dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.arch.Entities.Post;
import com.arch.Entities.Register;


@Transactional
@Component
public class PostDaoImpl implements PostDao{

	public List<Post> vv;
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void InsertPost(Post post) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(post);
        transaction.commit();
        session.flush(); //address will not get saved without this

	}

	@Override
	public Post SelectPost(int Id) {
 
		Session session = sessionFactory.openSession();
         Transaction transaction = session.beginTransaction();
         Post post= (Post) session.createCriteria(Post.class).add(Restrictions.eq("id", Id)).uniqueResult();
         transaction.commit();
         session.flush(); //address will not get saved without this
         return post;

	}

	@Override
	public void DeletePost(int Id) {
	      Session session = sessionFactory.openSession();
	      Transaction transaction = session.beginTransaction();

	      Query query = session.createQuery("delete from User where id:=id");
	      query.setParameter("id", Id);
	      query.executeUpdate();
	      transaction.commit();

	      session.flush(); //address will not get saved without this

	}

	@Override
	public void UpdatePost(Post post) {
		
	    Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(post);
        transaction.commit();

        session.flush(); //address will not get saved without this
		
	}

	@Override
	public List<Post> All() {
	vv=new ArrayList<Post>();

    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
   
   vv= session.createCriteria(Post.class).list();
    transaction.commit();
    session.flush(); //address will not get saved without this

		return vv;
	}
	
	@Override
	public ArrayList<String> AllP(int id,String Name) {
		 ArrayList<String> search =new ArrayList<String>();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
   
   Query x= session.createQuery("from Post where Id=? AND Name=? ");
   x.setInteger(0,id);
   x.setString(1,Name);

   List<Post> l =x.list();
   for(Post z:l)
   {
       search.add(z.getPosts());
   }
    transaction.commit();
    session.flush(); //address will not get saved without this
		return search;
	}
	
}