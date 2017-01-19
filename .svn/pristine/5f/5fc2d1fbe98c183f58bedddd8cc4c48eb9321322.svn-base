package com.liyuhao.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.liyuhao.dao.AdminDao;
import com.liyuhao.entity.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	@Resource(name = "sessionFactory")
	public void setSessionFacotry(SessionFactory sessionFacotry) {
		super.setSessionFactory(sessionFacotry);
	}

	public Admin save(Admin admin) {
		getHibernateTemplate().save(admin);
		return admin;
	}

	public void delete(Admin admin) {
		getHibernateTemplate().delete(admin);
	}

	public Admin findById(Integer id) {
		return (Admin) getHibernateTemplate().get("bean.Admin", id);
	}

	@SuppressWarnings("unchecked")
	public List<Admin> find(final String name, final String password) {
		@SuppressWarnings("rawtypes")
		List<Admin> executeResult = (List<Admin>) getHibernateTemplate().execute(new HibernateCallback() {// 回调函数
			public Object doInHibernate(Session session) throws HibernateException {

				// 创造criteria
				Criteria criteria = session.createCriteria(Admin.class);
				if (name != null && !name.equals("")) {
					criteria.add(Restrictions.eq("name", name));
				}
				if (password != null && !password.equals("")) {
					criteria.add(Restrictions.eq("password", password));
				}
				criteria.setFirstResult(0);
				criteria.setMaxResults(10);
				return criteria.list();
			}
		});
		return executeResult;
	}

	public Admin merge(Admin admin) {
		return (Admin) getHibernateTemplate().merge(admin);
	}
}