package cn.bbs.service.impl;

import cn.bbs.dao.AdminDAO;
import cn.bbs.domain.Admin;
import cn.bbs.service.AdminService;
/**
 * 业务层代码
 */
public class AdminServiceImpl implements AdminService {
    public AdminDAO adminDAO;
    
    public AdminDAO getAdminDAO() {
		return adminDAO;
	}

	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	/**
     * 注册普通用户
     */
	@Override
	public boolean register(Admin admin) {
		return adminDAO.insertAdmin(admin)>0?true:false;
	}

	@Override
	public boolean register2(Admin admin) {
		// TODO Auto-generated method stub
		return adminDAO.insertAdmin2(admin)>0?true:false;
	}

}
