import java.util.Scanner;
class Login
{
	int choice;
	String inputCnic;
	String inputName;
	String inputEmail;
	private String name;
	private String cnic;
	private String email;
	String enteredcnic;
	int enteredpassword;
	int password;
	boolean loginFailed = false;
	boolean wrong = false;
	Scanner sc = new Scanner(System.in);
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setCnic(String cnic)
	{
		this.cnic = cnic;
	}
	public String getCnic()
	{
		return this.cnic;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	void menu()
	{
		System.out.println("1. Create Account");
		System.out.println("2. Login");
		System.out.println("Enter your choice: ");
		this.choice = sc.nextInt();
		sc.nextLine();
	}
	
	void createAccount(Login l)
	{
		try
		{
			System.out.println("Enter your name: ");
			this.inputName = sc.nextLine();
			l.setName(inputName);
			System.out.println("Enter your cnic: ");
			this.inputCnic = sc.nextLine();
			l.setCnic(inputCnic);
			System.out.println("Enter your password: ");
			this.password = Integer.parseInt(sc.nextLine());
			System.out.println("Enter your email: ");
			this.inputEmail = sc.nextLine();
			l.setEmail(inputEmail);
			this.wrong = false;
		}
		catch(NumberFormatException ex)
		{
			this.wrong = true;
			System.out.println("Wrong credentials, please create your account again.");
		}
	}
	
	void loginAccount()
	{
		try
		{
			System.out.println("Enter cnic: ");
			this.enteredcnic = sc.nextLine();
			System.out.println("Enter password: ");
			this.enteredpassword = Integer.parseInt(sc.nextLine());
			this.loginFailed = false;
		}
		catch(NumberFormatException ex)
		{
			this.loginFailed = true;
			System.out.println("Wrong credentials please try again");
		}	
	}
	
}