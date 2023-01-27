package com.example.demo.entity;

public class UserDetails {
	
	private Long id;
	private  String fName;
	private String lName;
	private String userName;
	private String email;
	private String password;
	private String designation;
	private int contactNumber;
	private String country;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(Long id, String fName, String lName, String userName, String email, String password,
			String designation, int contactNumber, String country) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.contactNumber = contactNumber;
		this.country = country;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", fName=" + fName + ", lName=" + lName + ", userName=" + userName + ", email="
				+ email + ", password=" + password + ", designation=" + designation + ", contactNumber=" + contactNumber
				+ ", country=" + country + "]";
	}
	
	

}
