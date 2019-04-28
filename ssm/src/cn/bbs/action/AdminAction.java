package cn.bbs.action;

import cn.bbs.domain.Admin;
import cn.bbs.service.AdminService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 功能控制器逻辑代码
 * @return
 */
public class AdminAction extends ActionSupport {
	/**
	 * 
	 * 控制类对象版本号
	 * */
	private static final long serialVersionUID = 1L;
	public AdminService adminService=null;	
	public Admin admin;

	/**
	 *用户注册
	 * @return
	 */
	public String register(){
		boolean regAdmin=adminService.register(admin);
		if(regAdmin==true){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}

   public String register2(){
		adminService.register2(admin);
		return SUCCESS;
	 
   }

	/**
	 * 。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
	 * 服务型装箱拆箱代码
	 */
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
