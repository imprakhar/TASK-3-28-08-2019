package wp.specification;

public class HDFCCard implements ATMCard {

	@Override
	public void displayBalance() {
		System.out.println("Balance from HDFC Card");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Debited from HDFC Card");

	}

	@Override
	public void pinGeneration() {
		System.out.println("Pin generated for HDFC Card");

	}

}
