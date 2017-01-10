/**
 * 
 */
/**
 * @author °¢À­¼×
 *
 */
package cmo.liyuhao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyuhao.entity.Admin;
import com.liyuhao.service.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class addAdmin extends AbstractJUnit4SpringContextTests {
	@Resource
	private adminService adminService;

	@Test
	public void addAdmin() {
		Admin admin = new Admin();
		admin.setName("1881412743");
		admin.setPassword("1881412743");

		admin = adminService.add_update(admin);
		if (admin == null) {
			System.out.println(admin);
		} else {
			System.out.println(admin);
		}
	}

}