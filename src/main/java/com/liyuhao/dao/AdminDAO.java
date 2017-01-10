package com.liyuhao.dao;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.liyuhao.entity.Admin;

public class AdminDAO extends HibernateDaoSupport {

	public Admin save(Admin admin) {
		getHibernateTemplate().save(admin);
		return admin;
	}

	public void delete(Admin persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);
	}

	public Admin findById(Integer id) {
		return (Admin) getHibernateTemplate().get("bean.Admin", id);
	}

	@SuppressWarnings("rawtypes")
	public List findByName(Object name) {
		String queryString = "from Admin as model where model.name = ?";
		return getHibernateTemplate().find(queryString, name);
	}

	@SuppressWarnings("rawtypes")
	public List findAll() {
		String queryString = "from Admin";
		return getHibernateTemplate().find(queryString);
	}

	public Admin merge(Admin detachedInstance) {
		return (Admin) getHibernateTemplate().merge(detachedInstance);
	}

	public static AdminDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AdminDAO) ctx.getBean("AdminDAO");
	}
}