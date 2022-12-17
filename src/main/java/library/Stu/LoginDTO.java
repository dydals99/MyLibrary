package library.Stu;

public class LoginDTO {
	//로그인 테이블 멤버변수
	private String stu_no;
	private String password;
	private String email;
	private String regi_user;
	private java.util.Date regi_date;
	private String updt_user;
	private java.util.Date updt_date;
	
	//게터/세터
	public String getStu_no() {
		return stu_no;
	}
	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegi_user() {
		return regi_user;
	}
	public void setRegi_user(String regi_user) {
		this.regi_user = regi_user;
	}
	public java.util.Date getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(java.util.Date regi_date) {
		this.regi_date = regi_date;
	}
	public String getUpdt_user() {
		return updt_user;
	}
	public void setUpdt_user(String updt_user) {
		this.updt_user = updt_user;
	}
	public java.util.Date getUpdt_date() {
		return updt_date;
	}
	public void setUpdt_date(java.util.Date updt_date) {
		this.updt_date = updt_date;
	}
	
}
