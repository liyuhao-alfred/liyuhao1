package com.liyuhao.dao;

import java.util.List;

import com.liyuhao.entity.Admin;

public interface AdminDao {

	/**
	 * 保存管理员
	 * 
	 * @param admin
	 * @return
	 */
	public Admin save(Admin admin);

	/**
	 * 删除管理员
	 * 
	 * @param admin
	 */
	public void delete(Admin admin);

	/**
	 * 通过ID查找管理员
	 * 
	 * @param id
	 * @return
	 */
	public Admin findById(Integer id);

	/**
	 * 通过其他属性查找管理员
	 * 
	 * @param name
	 * @return
	 */
	public List<Admin> find(String name, String password);

	/**
	 * 更新管理员
	 * 
	 * @param detachedInstance
	 * @return
	 */
	public Admin merge(Admin admin);

}