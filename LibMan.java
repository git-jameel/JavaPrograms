import java.util.*;
public  class LibMan {
	
	public static void main(String[] args) { //MAIN METHOD
		System.out.println("Enter 1. Adminlogin || Enter 2. Userlogin ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		switch(n) {
		case 1:
			System.out.println("Welcome Admin...");
			Admin.signin();
			break;
		case 2:
			System.out.println("Welcome u...");
		}
	}
	public class Admin{
		 public static void signin() //ADMIN SIGNIN METHOD
		{
			String Adminname="Jameel";
			String Adminpwd="Afsar@123";
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Signuped username: ");
			String username=scan.nextLine();
			System.out.println("Enter Signuped password: ");
			String password=scan.nextLine();
			//Admin obj=new Admin();
			if(username.equals(Adminname)&&password.equals(Adminpwd)){
				System.out.println("Congrats...Admin signed in successfully!!"); 
				System.out.println("----------------------------------------");
				System.out.println("1. View Books");
				System.out.println("2. Add Books");
				System.out.println("3. Update Books");
				System.out.println("4. Delete Books");
				switch(n)
				{
					case 1:
						Admin.view();
						break;
					case 2:
						obj.add();
						break;
					case 3:
						obj.update();
						break;
					case 4:
						obj.delete();
						break;
						
				}
			else
			{
				System.out.println("Username or Password Mismatch!!");
				AdminSignin();
		}
		}
}}