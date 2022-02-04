
public class CurrentAccount extends Account{

	public CurrentAccount(Costumer costumer) {
		super(costumer);
		
	}

	@Override
	public void printStatement() {
		System.out.println("Current Account Statement");
		super.printCommonInfos();
		
	}
	
	
	

	
	}

