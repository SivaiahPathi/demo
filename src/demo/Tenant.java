package demo;

public class Tenant implements Comparable{
	
	private String name;
	private int age;
	private String mobileNo;
	private String occupation;
	private String dob;
	
	public Tenant(String name, int age, String mobileNo, String occupation, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.occupation = occupation;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Tenant t = (Tenant) o;
		return this.getAge()-t.getAge();
	}
	
	

}
