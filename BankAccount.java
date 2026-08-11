package Day8;

public class BankAccount {
	static class BankAccount1{
		private double balance;
		//deposite
		public void deposit(double amount) {
			if(amount>0) {
				balance=balance+amount;
				System.out.println("Deposited:" + amount);
			}else {
				System.out.println("invalid deposit amount");
			}
		}
		//withdraw
		public void withdraw(double amount) {
			if(amount<=0) {
				System.out.println("invalid withdraw amount.");
				
			}else if(amount>balance) {
				System.out.println("insufficient balance");
			}else {
				System.out.println("withdraw:" + amount);
			}
		}
		//get balance
		public double getBalance() {
			return balance;
		}
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(1000);
		System.out.println("balance:" + account.getBalance());
		account.withdraw(300);
		System.out.println("balance:" + account.getBalance());

	}

}
