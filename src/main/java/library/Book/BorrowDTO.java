package library.Book;

public class BorrowDTO {
	//책대여 테이블 멤버변수
	private String borrow_code;
	private String book_code;
	private String stu_no;
	private java.util.Date start_time;
	private java.util.Date end_schedule;
	private java.util.Date end_time;
	private String regi_user;
	private java.util.Date regi_date;
	private String updt_user;
	private java.util.Date updt_date;
	
	//게터/세터
	public String getBorrow_code() {
		return borrow_code;
	}
	public void setBorrow_code(String borrow_code) {
		this.borrow_code = borrow_code;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getStu_no() {
		return stu_no;
	}
	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}
	public java.util.Date getStart_time() {
		return start_time;
	}
	public void setStart_time(java.util.Date start_time) {
		this.start_time = start_time;
	}
	public java.util.Date getEnd_schedule() {
		return end_schedule;
	}
	public void setEnd_schedule(java.util.Date end_schedule) {
		this.end_schedule = end_schedule;
	}
	public java.util.Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(java.util.Date end_time) {
		this.end_time = end_time;
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
