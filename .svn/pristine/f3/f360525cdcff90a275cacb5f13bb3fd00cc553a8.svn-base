
package com.liyuhao.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyuhao.action.AdminAction;
import com.liyuhao.entity.Admin;
import com.liyuhao.utils.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class optimisticLock extends AbstractJUnit4SpringContextTests {
	private static final Logger log = Logger.getLogger(AdminAction.class);
	private static int version;

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Test
	public void testSave() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Admin a = new Admin();
		a.setName(util.GetCurrentTime());
		session.save(a);

		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testOptimisticLock() {
		Session session = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		session.beginTransaction();
		session2.beginTransaction();

		Admin a1 = (Admin) session.load(Admin.class, 1);
		a1.setName(util.GetCurrentTime());
		session.update(a1);

		Admin a2 = (Admin) session2.load(Admin.class, 1);
		a2.setName(util.GetCurrentTime());
		session2.update(a2);

		// 第一个session一旦提交，version就会+1
		log.info("version1:" + a1.getVersion());
		session.getTransaction().commit();
		log.info("version1:" + a1.getVersion());

		// 第二个session提交的时候，一看version不一样就会报错,出了错误做个记录，下次再提交(也可以用其他方法)
		log.info("version2:" + a2.getVersion());
		session2.getTransaction().commit();
		log.info("version2:" + a2.getVersion());

		session.close();
		session2.close();
	}
}
