
package com.liyuhao.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
public class pressimisticLock extends AbstractJUnit4SpringContextTests {
	private static final Logger log = Logger.getLogger(AdminAction.class);

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Test
	public void testSave() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Admin admin = new Admin();
		admin.setName(util.GetCurrentTime());
		admin.setPassword(util.GetCurrentTime());

		session.save(admin);

		session.getTransaction().commit();
		session.close();
	}

	@Test
	public void testOperation1() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Admin admin = (Admin) session.load(Admin.class, 1);
		String name = admin.getName();
		// do some caculations
		name = util.GetCurrentTime();
		// 在保存时很有可能会把在同一时期修改的给覆盖掉,这个时候上一把"锁"就可以避免这个问题
		admin.setName(name);
		session.getTransaction().commit();
		session.close();
	}

	// 下面这个就是对上面那个例子做的修改
	@Test
	public void testPessimisticLock() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// 给它加把锁，加锁的机制上面已经提到了
		Admin admin = (Admin) session.load(Admin.class, 1, LockMode.UPGRADE);
		String name = admin.getName();
		// do some caculations
		name = util.GetCurrentTime();
		admin.setName(name);
		session.getTransaction().commit();
		session.close();
	}
}
