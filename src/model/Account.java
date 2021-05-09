package model;

public class Account {
	protected int accno;
	protected String name;
	protected String address;
	protected int amount;
	protected String acc_type;
	protected int phone;
	protected String branch;
	
	public Account() {
		
	}
	
	public Account(int accno, int amount, String branch, String name, String acc_type, String address, int phone) {
		super();
		this.accno = accno;
		this.amount = amount;
		this.branch = branch;
		this.acc_type = acc_type;
		this.name = name;
		this.phone = phone;
		this.address = address;
		
	}
	
	

	public Account(String phone, int accno, int amount, String branch, String acc_type) {
		super();
		this.accno = accno;
		this.amount = amount;
		this.branch = branch;
		this.acc_type = acc_type;
		
	}

	
	public int getAccno() {
		return accno;
	}
	public void setAccno(){
		this.accno = accno;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(){
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(){
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(){
		this.address = address;
	}
	
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(){
		this.acc_type = acc_type;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(){
		this.phone = phone;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(){
		this.branch = branch;
	}
	

}