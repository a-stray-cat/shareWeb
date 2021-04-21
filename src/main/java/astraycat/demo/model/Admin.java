package astraycat.demo.model;

public class Admin {
	String adminname;
	String adminpassword;
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
	}
}
