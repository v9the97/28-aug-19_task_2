package co.ATM;

public class ATM_Machine {
	
	public void bind(ATMSpecification atmspecification)
	{
		atmspecification.balance();
		atmspecification.pin();
		atmspecification.creditmoney();
		atmspecification.debitmoney();
		System.out.println("------------------------------------" );
		
	}
	public static void main(String[]args)
	{
		Sbi_Card sbi_card=new Sbi_Card();
		ATM_Machine atm_machine=new ATM_Machine();
		atm_machine.bind(sbi_card);
		atm_machine.bind(new HDFC_Card());
	}

}
