import java.util.Scanner;
class Account
{
	int choice;
	double accountBalance = 0.0d;
	long accountNumber;
	long phoneNumber;
	boolean wrongInfo = false;
	Scanner sc = new Scanner(System.in);
	void remainingMenu()
	{
		System.out.println("3. Deposit Cash");
		System.out.println("4. Balance Inquiry");
		System.out.println("5. Get profile");
		System.out.println("6. Exit");
		System.out.println("Enter your choice: ");
		this.choice = sc.nextInt();
		sc.nextLine();
	}
	
	void depositCash()
	{
		try
		{
			System.out.println("Enter account number: ");
			this.accountNumber = Long.parseLong(sc.nextLine());
			int length = String.valueOf(accountNumber).length();
			if(this.accountNumber < 0)
			{
				throw new NegativeAccountNumberException("Account number should be positive");
			}
			else if(length < 8)
			{
				throw new Exception("Account number should be atleast of 8 digits or greater");
			}
			else
			{
				System.out.println("Enter phone Number: ");
				this.phoneNumber = Long.parseLong(sc.nextLine());
				System.out.println("Enter Amount that you want to deposit: ");
				this.accountBalance += sc.nextInt();
				System.out.println("Your account has been created with " + this.accountBalance + " amount");
				this.wrongInfo = false;
			}
		}
		catch(Exception ex)
		{
			this.wrongInfo = true;
			System.out.println(ex.getMessage());
		}
	}
	
	void balanceInquiry()
	{
		System.out.println("Your current balance is: " + this.accountBalance);
	}
	
	void getProfile(Login l)
	{
		System.out.println(" \t Your Information \t ");
		System.out.println("Name:         " + l.getName());
		System.out.println("Cnic:         " + l.getCnic());
		System.out.println("Email:         " + l.getEmail());
		System.out.println("Current Balance:         " + this.accountBalance);
	}
	
}