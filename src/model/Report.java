package model;

public class Report {
	protected int id;
	protected String f_acc;
	protected String t_acc;
	protected String context;
	protected int amount;
	
	
	public Report() {
		
	}
	
	
	public Report(int id, String f_acc, String t_acc, String context, int amount) {
		super();
		this.id = id;
		this.f_acc = f_acc;
		this.t_acc = t_acc;
		this.context = context;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getF_acc() {
		return f_acc;
	}
	public void setF_acc(String f_acc) {
		this.f_acc = f_acc;
	}
	
	public String getT_acc() {
		return t_acc;
	}
	public void setT_acc(String t_acc) {
		this.t_acc = t_acc;
	}
	
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int Amount) {
		this.amount = amount;
	}
	
}
