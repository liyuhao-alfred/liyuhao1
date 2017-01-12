/**
 * @author 李裕豪
 *
 */
package com.liyuhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyuhao.entity.Admin;
import com.liyuhao.service.AdminService;
import com.liyuhao.dao.*;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	public Admin login(String name, String password) {
		List<Admin> list = adminDao.find(name, password);
		if (list.size() == 0) {
			return null;
		} else {
			Admin admin = (Admin) list.get(0);
			return admin;
		}
	}

	public Admin findById(Integer id) {
		return adminDao.findById(id);
	}

	public Admin save_update(Admin admin) {
		// 不存在数据库的ID，则新增对象
		if (admin.getId() == null) {
			admin = adminDao.save(admin);
			return admin;
		}
		// 存在合法的数据库的ID，则更新
		else if (admin.getId().intValue() > 0) {
			admin = adminDao.merge(admin);
			return admin;
		}
		// 非法ID，操作失败
		else {
			return null;
		}
	}

	public void delete(Admin admin) {
		adminDao.delete(admin);
	}

	public List<Admin> find(String name, String password) {
		List<Admin> list = adminDao.find(name, password);
		return list;
	}

}
