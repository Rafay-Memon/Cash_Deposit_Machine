import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Login l = new Login();
		Account ac = new Account();
		int cnic;
		int password;
		boolean wrongAccount = false;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		System.out.println(" \t Welcome to Cash Deposit Machine \t ");
		l.menu();
		while(l.choice != 1)
		{
			System.out.println("Please create account first then login");
			l.menu();
		}
		do
		{
			l.createAccount(l);
		}
		while(l.wrong == true);
		System.out.println("Your account has been created succefully, you can login now. ");
		l.menu();
		while(l.choice != 2)
		{
			System.out.println("Your account is already created now just login.");
			l.menu();
		}
		do
		{
			l.loginAccount();
			wrongAccount = false;
			if(!(l.enteredcnic.equals(l.getCnic())) || l.enteredpassword != l.password)
			{
				wrongAccount = true;
				System.out.println("Your info does not matches so try again");
			}
		}
		while(l.loginFailed == true || wrongAccount == true);
		do
		{
			ac.remainingMenu();
			switch(ac.choice)
			{
				case 3:
					ac.depositCash();
					while(ac.wrongInfo == true)
					{
						ac.depositCash();
					}
					break;
				case 4:
					ac.balanceInquiry();
					break;
				case 5:
					ac.getProfile(l);
					break;
				case 6:
					exit = true;
					break;
				default:
					System.out.println("Invalid option.");
					break;
				
			}
		}
		while(exit != true);
	}
}