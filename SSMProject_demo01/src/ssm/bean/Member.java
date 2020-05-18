package ssm.bean;

public class Member {
	private String id;
	private String name;
	private String phone;
	private String address;
	private String hobby;
	private String date;
	private String remarks;
	private Integer sex;
	private Integer age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Member(String id, String name, String phone, String address, String hobby, String date, String remarks,
			Integer sex, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.date = date;
		this.remarks = remarks;
		this.sex = sex;
		this.age = age;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", hobby=" + hobby
				+ ", date=" + date + ", remarks=" + remarks + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
