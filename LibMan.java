package JavaBasics;
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
	public static class Admin{
		 public static void signin() //ADMIN SIGNIN METHOD
		{
			String adminarr[]= {"Jameel","Afsar@123"};
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Signuped username: ");
			String username=scan.nextLine();
			System.out.println("Enter Signuped password: ");
			String password=scan.nextLine();
			//Admin obj=new Admin();
			if(username.equals(adminarr[0])&&password.equals(adminarr[1])){
				System.out.println("Congrats...Admin signed in successfully!!"); 
				System.out.println("----------------------------------------");
				System.out.println("1. View Books");
				System.out.println("2. Add Books");
				System.out.println("3. Update Books");
				System.out.println("4. Delete Books");
				System.out.println("Select any of 4: ");
				int n1=scan.nextInt();
				switch(n1)
				{
					case 1:
						Admin.view();
						break;
					case 2:
						//Admin.add();
						break;
					case 3:
						//Admin.update();
						break;
					case 4:
						//Admin.delete();
						break;
					default:
						System.out.println("Enter any of 4 only: ");		
				}
					}
			else
			{
				System.out.println("Username or Password Mismatch!!");
				Admin.signin();
		}
		}
		 public  static void view()
		 {
			Scanner scan=new Scanner(System.in);
			String idarr[]=new String[2];
			String namearr[]=new String[5];
			 int pricearr[]=new int[5];
			int stockarr[]=new int[5];
			System.out.println("Enter book information: ");
			for(int i=0;i<idarr.length;i++)
			{
				
				idarr[i]=scan.next();
				namearr[i]=scan.next();
				pricearr[i]=scan.nextInt();
				stockarr[i]=scan.nextInt();
			}
			System.out.println("BookId"+"\tname"+"\tPrice"+"\tStock");
			for(int i=0;i<idarr.length;i++)
			{
				System.out.print(idarr[i]+"\t"+namearr[i]+"\t"+pricearr[i]+"\t"+stockarr[i]+"\n");
			}
		 }
}
	

}