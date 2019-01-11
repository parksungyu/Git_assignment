package Git_assignment;
//4)  예약 ( 행위 )
//속성 : 시간, 인원, 예약자, 연락처 ,  상태 (예약중, 예약취소)
//행동 : 예약하기, 예약변경, 취소, 조회


public class Reservation {

	private int date_year;
	private int date_month;
	private	int date_day;
	private int time_hour;
	private int time_minute;
	private String date[]= {Integer.toString(date_year),Integer.toString(date_month),
			Integer.toString(date_day),Integer.toString(time_hour),Integer.toString(time_minute)};
	private int people;
	private String name;
	private String phone_num;
	private boolean res_condition;
	public int getDate_year() {
		return date_year;
	}
	public void setDate_year(int date_year) {
		this.date_year = date_year;
	}
	public int getDate_month() {
		return date_month;
	}
	public void setDate_month(int date_month) {
		this.date_month = date_month;
	}
	public int getDate_day() {
		return date_day;
	}
	public void setDate_day(int date_day) {
		this.date_day = date_day;
	}
	public int getTime_hour() {
		return time_hour;
	}
	public void setTime_hour(int time_hour) {
		this.time_hour = time_hour;
	}
	public int getTime_minute() {
		return time_minute;
	}
	public void setTime_minute(int time_minute) {
		this.time_minute = time_minute;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public boolean isRes_condition() {
		return res_condition;
	}
	public void setRes_condition(boolean res_condition) {
		this.res_condition = res_condition;
	}
	
	public String[] getDate() {
		return date;
	}
	public void setDate(String[] date) {
		this.date = date;
	}
	void do_reservation(String date[],int people,
			String name,String phone_num,boolean res_condition) {
		setDate(date);
		setPeople(people);
		setName(name);
		setPhone_num(phone_num);
		
	}
	void change_reservation(boolean res_condition) {
		
	}
	}


