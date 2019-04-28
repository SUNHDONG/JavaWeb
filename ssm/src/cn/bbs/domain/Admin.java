package cn.bbs.domain;
/**
 * 简单的pojo类
 * @author Asus
 *
 */
public class Admin{
private int id;
private String adminName;
private String adminPass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPass() {
		return adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

	@Override
	public String toString() {
		return "Admin{" +
				"id=" + id +
				", adminName='" + adminName + '\'' +
				", adminPass='" + adminPass + '\'' +
				'}';
	}
}
