import java.util.*;
public  class LoginModule {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter '1' for Admin login || Enter '2' for Userlogin ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		switch(n) {
		case 1:
			System.out.println("welcome Admin");
			break;
		case 2:
			System.out.println("welcome User");
			break;
		default:
			System.out.println("Enter 1 or 2 only...");
			break;
		}
	}
	public static class AdminLogin{
		public static void signup() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Username: ");
			String Uname=scan.nextLine();
			System.out.println("Enter a Secure password: ");
			
			
		}
		public static void secpwd() {
			final int uppercase,lowercase,numbercase,specialcase; 
			uppercase=lowercase=numbercase=specialcase=2;
			int uppercount,lowercount,numbercount,specialcount;
			uppercount=lowercount=numbercount=specialcount=0;
			System.out.println("Enter a secure password: ");
			System.out.println("Secure password must have atleast 2 upper&lower case letters,digits and special characters");
			Scanner scan=new Scanner(System.in);
			String pwd=scan.nextLine();
	        char pwdarr[]=pwd.toCharArray();
	        for(int i=0;i<pwdarr.length;i++){
	        	if(pwdarr[i]>='A'&&pwdarr[i]<='Z')
	        		uppercount++;
	        	else if(pwdarr[i]>='a'&&pwdarr[i]<='z')
	        		lowercount++;
	        	else if(pwdarr[i]>='0'&&pwdarr[i]<='9')
	        		numbercount++;
	        	else if(pwdarr[i]>='!'&&pwdarr[i]<='/')
	        		specialcount++;
	        	else
	        		System.out.println();
	        	
	        }
	        if(uppercase>=uppercount&&lowercase>=lowercount&&numbercase>=numbercount&&specialcase>=specialcount)
	        	System.out.println("secure password: ");
	        else
	        	System.out.println("Not a secure password!!! Re enter password");
			
		}
	}

}
