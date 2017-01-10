package com.liyuhao.action;

import com.liyuhao.entity.Admin;
import com.liyuhao.service.adminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class adminAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private Admin admin;
	private adminService adminService;

	public String login() {
		admin = adminService.login(name, password);
		if (admin == null) {
			return "login";
		} else {
			ActionContext.getContext().put("info", admin.toString());
			return "success";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public adminService getAdminService() {
		return adminService;
	}

	public void setAdminService(adminService adminService) {
		this.adminService = adminService;
	}

}
