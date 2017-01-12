package com.liyuhao.service;

import java.util.List;

import com.liyuhao.entity.Admin;

public interface AdminService {

	/**
	 * 使用名字和密码登录
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	Admin login(String name, String password);

	/**
	 * 通过ID查找管理员
	 * 
	 * @param id
	 * @return
	 */
	Admin findById(Integer id);

	/**
	 * 如果没有则保存管理员，有则更新管理员
	 * 
	 * @param admin
	 * @return
	 */
	Admin save_update(Admin admin);

	/**
	 * 删除管理员
	 * 
	 * @param admin
	 */
	void delete(Admin admin);

	/**
	 * 查找管理员
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	List<Admin> find(String name, String password);
}
