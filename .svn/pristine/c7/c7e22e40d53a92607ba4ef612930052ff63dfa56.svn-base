package com.liyuhao.service;

import java.util.List;

import com.liyuhao.dao.AdminDAO;
import com.liyuhao.entity.Admin;

public class adminService {

	private Admin admin;
	private AdminDAO adminDao;

	@SuppressWarnings("rawtypes")
	public Admin login(String name, String password) {
		List list = (List) adminDao.findByName(name);
		if (list.size() == 0) {
			return null;
		} else {
			admin = (Admin) list.get(0);
			if (admin.getPassword().equals(password)) {
				return admin;
			} else {
				return null;
			}
		}
	}

	public Admin add_update(Admin admin) {
		if (admin.getId() == null) {
			admin = adminDao.save(admin);
			return admin;
		} else if (admin.getId().intValue() > 0) {
			admin = adminDao.merge(admin);
			return admin;
		} else {
			return null;
		}
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public AdminDAO getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDAO adminDao) {
		this.adminDao = adminDao;
	}
}
