

public abstract class Account implements IAccount{
	
	private static final int STANDARD_AGENCY = 1;
	private static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double accountBalance;

	
	protected Costumer costumer;
	
	
	public Account(Costumer costumer) {
		this.agency = STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
		this.costumer = costumer;
	}

		@Override
		public void withdraw(double amount) {
			accountBalance -= amount;
			
		}

		@Override
		public void deposit(double amount) {
			accountBalance += amount;
			
		}

		@Override
		public void transfer(double amount, Account targetAccount) {
			this.withdraw(amount);
			targetAccount.deposit(amount);
			
		}	
	
		public int getAgency() {
			return agency;
		}
		
		public int getNumber() {
			return number;
		}
		
		public double getAccountBalance() {
			return accountBalance;
		}
	

	protected void printCommonInfos() {
		System.out.println(String.format("Holder: %s", this.costumer.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("AccountBalance: %.2f", this.accountBalance));
	}
}

