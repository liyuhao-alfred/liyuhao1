package com.liyuhao.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.liyuhao.entity.Admin;
import com.liyuhao.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

public class AdminAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(AdminAction.class);
	@Autowired
	private AdminService adminService;

	/**
	 * 用户登录
	 * 
	 * @return
	 */
	public String login() {
		// 用户名
		String name = ServletActionContext.getRequest().getParameter("name");
		// 用户密码
		String password = ServletActionContext.getRequest().getParameter("password");

		Admin admin = adminService.login(name, password);
		// 打印admin
		log.info(admin);
		// 如果没有取到数据，则返回继续登录页面，取到数据则返回成功页面并且直接显示
		if (admin == null) {
			return "login";
		} else {
			ActionContext.getContext().put("info", admin.toString());
			return "success";
		}
	}

}
