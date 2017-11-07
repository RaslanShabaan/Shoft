package com.arch.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arch.Entities.authorities;

@Service
public class authoritiesService {

	@Autowired
	com.arch.Dao.authoritiesDao dao;

		public void Insertauthorities (authorities authorities)
		{
			dao.Insertauthorities(authorities);
		}

		
		public void Selectauthorities (String  username)
		{
			dao.Selectauthorities(username);
		}
		
		public void Deleteauthorities (String  username)
		{
			dao.Deleteauthorities(username);
		}

		public void Updatetauthorities (authorities authorities)
		{
			dao.Updateauthorities(authorities);
		}


		public List<authorities> SelectAllauthorities ()
		{
				
		return dao.SelectALLauthorities();
		
		}

	}
