package day3;

public class Encap_oops {

	public static void main(String[] args) {
		Encap_Account Sai= new Encap_Account();
		Sai.setAccno(23456543);
		Sai.setName("Shruti");
		Sai.setEmail("shruti@gmil.com");
		Sai.setAmount(3400);
		System.out.println(Sai.getAcc_no()+" "+Sai.getName()+" "+Sai.getEmail()+" "+Sai.getAmount());
	}

}
