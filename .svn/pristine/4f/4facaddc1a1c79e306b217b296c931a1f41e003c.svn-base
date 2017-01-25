
package com.liyuhao.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyuhao.action.AdminAction;
import com.liyuhao.entity.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class cacheTest extends AbstractJUnit4SpringContextTests {
	private static final Logger log = Logger.getLogger(AdminAction.class);
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Test
	public void getAdmin() {

		String name = "188";
		String password = "188";

		for (int i = 0; i < 3; i++) {
			List admins = null;
			Criteria criteria = this.sessionFactory.openSession().createCriteria(Admin.class);
			criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
			criteria.add(Restrictions.like("password", password, MatchMode.ANYWHERE));
			criteria.setFirstResult(0);
			criteria.setMaxResults(100);
			criteria.setCacheable(true);
			admins = criteria.list();
			log.info(admins.size());
		}

	}
}
