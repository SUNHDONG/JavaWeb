package cn.bbs.dao;

import cn.bbs.domain.Admin;
/**
 * 数据层代码
 */
public interface AdminDAO {
	/**
	 * 插入用户信息数据
	 * @param admin
	 * @return
	 */
   int insertAdmin(Admin admin);
   int insertAdmin2(Admin admin);
}
