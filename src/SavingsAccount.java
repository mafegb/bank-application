
public class SavingsAccount extends Account{

	public SavingsAccount(Costumer costumer) {
		super(costumer);
		
	}

	@Override
	public void printStatement() {
		System.out.println("Savings Account Statement");
		super.printCommonInfos();
	}
}
