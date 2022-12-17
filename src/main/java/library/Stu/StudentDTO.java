package library.Stu;

public class StudentDTO {
	//학생테이블 멤버변수
	private String stu_no;
	private String stu_name;
	private String stu_dept;
	private String stu_year;
	private String stu_class;
	private String stu_gender;
	private String stu_height;
	private String stu_weight;
	private String stu_status;
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
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_dept() {
		return stu_dept;
	}
	public void setStu_dept(String stu_dept) {
		this.stu_dept = stu_dept;
	}
	public String getStu_year() {
		return stu_year;
	}
	public void setStu_year(String stu_year) {
		this.stu_year = stu_year;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public String getStu_gender() {
		return stu_gender;
	}
	public void setStu_gender(String stu_gender) {
		this.stu_gender = stu_gender;
	}
	public String getStu_height() {
		return stu_height;
	}
	public void setStu_height(String stu_height) {
		this.stu_height = stu_height;
	}
	public String getStu_weight() {
		return stu_weight;
	}
	public void setStu_weight(String stu_weight) {
		this.stu_weight = stu_weight;
	}
	public String getStu_status() {
		return stu_status;
	}
	public void setStu_status(String stu_status) {
		this.stu_status = stu_status;
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
