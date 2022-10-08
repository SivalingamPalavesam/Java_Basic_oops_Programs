package com.oopsconcept;


class AccountClass
{
	private int account_no;
	
	private String name;
	
	private String e_mail;
	
	private float amount;

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		AccountClass obj = new  AccountClass();
		
		 obj.setAccount_no(1234567);
		 
		 System.out.println(obj.getAccount_no());
		 
		 obj.setName("Siva");
		 
		 System.out.println(obj.getName());
		 
		 obj.setE_mail("siva@qbranix.com");
		 
		 System.out.println(obj.getE_mail());
		 
		 obj.setAmount(1000.90f);
		 
		 System.out.println(obj.getAmount());
		 
		 
	}

}
