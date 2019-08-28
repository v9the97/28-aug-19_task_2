package co.ATM;

public class Sbi_Card implements ATMSpecification
{
	
	public void balance(){
	System.out.println("Your sbi balance is   "+25415);
	}
	public void pin(){
		System.out.println("Your sbi pin is  "+1234);
			
	}
	public void creditmoney(){
		System.out.println("Your sbi creditmoney is  "+1234);
	}
	public void debitmoney()
	{
		System.out.println("Your sbi depit is  "+1234);
	}
}
