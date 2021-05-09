package model;

/**
 * This is a model class represents a User entity for the table User in database
 */

public class User {
	protected int id;
	protected String name;
	protected String password;
	protected String address;
	protected String email;
	protected int amount;
	protected String acc_type;
	protected int zip;
	protected String branch;
	protected int phone;
	protected String role;
	protected String country;
	protected String city;
	protected int accno;
	protected String gender;
	protected String dob;
	
	public User() {
	}
	
	//login
	public User(String name, String password, int phone, String role)
	{
		super();
		
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.role = role;
	}
	
	
	public User(int id, String acc_type, String role, String city, String country, String address, int amount)
	{
		super();
		this.id = id;
		this.acc_type = acc_type;
		this.amount = amount;
		this.country = country;
		this.city = city;
		this.address = address;
		this.role = role;
	}
	
	
	
	
	//user-list, insert
	public User(String name, String password, String address, String email, int amount, String acc_type, int zip, String branch, int phone, String role, String country, String city, int accno, String gender, String dob) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.amount = amount;
		this.acc_type = acc_type;
		this.zip = zip;
		this.branch = branch;
		this.phone = phone;
		this.role = role;
		this.country = country;
		this.city = city;
		this.accno = accno;
		this.gender = gender;
		this.dob = dob;
		
	}
	
	
	public User(int id, String name, String password, String address, String email, int amount, String acc_type, int zip, String branch, int phone, String role, String country, String city, int accno, String gender, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.amount = amount;
		this.acc_type = acc_type;
		this.zip = zip;
		this.branch = branch;
		this.phone = phone;
		this.role = role;
		this.country = country;
		this.city = city;
		this.accno = accno;
		this.gender = gender;
		this.dob = dob;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
}
