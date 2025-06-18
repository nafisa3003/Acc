public class Account {
	private String name;
	private String accountNo;
	private double balance;
	private String pin;
	
	public Account() {
		balance = 500.00;
	}
	public void setAccount(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccount() {
		return accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPin() {
		return pin;
	}
	public void depositBalance(double amount) {
		balance += amount;
	}
	public void withdrawBalance(double amount) {
		if(amount <= balance) balance -= amount;
		else System.out.println("Insufficient balance!");
	}
	public void display() {
		System.out.println("\nAccount Info: ");
		System.out.println("\nName: " + name);
		System.out.println("\nAccount No: " + accountNo);
		System.out.printf("\nBalance: BDT %.2f\n", balance);
	}
}
