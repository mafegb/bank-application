
public class Main {

	public static void main(String[] args) {
		Costumer mafe = new Costumer();
		mafe.setName("mafe");
		
		Account cc = new CurrentAccount(mafe);
		Account savings = new SavingsAccount(mafe);
		
		cc.printStatement();
		savings.printStatement();
	}

}
