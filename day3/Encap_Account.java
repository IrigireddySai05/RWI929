package day3;

public class Encap_Account {
	private long accno;
	private String name, email;
	private float amount;	
	
	public long getAcc_no() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public float getAmount() {
		return amount;
	}
	
	public void setAccno(long acc_no) {
		this.accno=acc_no;
	}
	public void setName(String Name) {
		this.name=Name;
	}
	public void setEmail(String Email) {
		this.email=Email;
	}
	public void setAmount(float Amount) {
		this.amount=Amount;
	}
	
	
}
