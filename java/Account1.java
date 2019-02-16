class BankAccount{
	float amount;
	void Deposit(int amt){
        amount=amount+amt;
		System.out.println(amt+" deposited");
	}
	void withdraw(float amt){
		System.out.println();
		if(amount<amt){
			System.out.println("Insufficient Balance");
		}
		else{
			amount=amount-amt;
			System.out.println(amt+" withdrawn"); 
		}
	}
}
class TestBankAccount{
	public static void main(String[] args){
		BankAccount b1 = new BankAccount();
        b1.Deposit(56743);
        b1.withdraw(87689);
	}
}