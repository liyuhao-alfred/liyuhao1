
package com.liyuhao.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyuhao.action.AdminAction;
import com.liyuhao.entity.Admin;
import com.liyuhao.service.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AdminTest extends AbstractJUnit4SpringContextTests {
	private static final Logger log = Logger.getLogger(AdminAction.class);
	@Autowired
	private AdminService adminService;

	@Test
	public void addAdmin() {
		Admin admin = new Admin();
		admin.setName("1881412743");
		admin.setPassword("1881412743");

		admin = adminService.save_update(admin);
		if (admin == null) {
			log.info("fail");
		} else {
			log.info(admin);
		}
	}

	@Test
	public void findAdmin() {
		String name = "188141743";
		String password = "1881412743";

		List<Admin> list = adminService.find(name, password);
		list = null;
		try {
			System.out.println(list.get(1));
		} catch (Exception e) {
			log.error(e);
		}

		for (int i = 0; i < list.size(); i++) {
			Admin admin = list.get(0);
			log.info(admin);
		}
	}
}