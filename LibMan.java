
import java.util.Scanner;

public class LibMan {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter 1. Adminlogin || Enter 2. Userlogin ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		switch (n) {
		case 1:
			System.out.println("Welcome Admin...");
			Admin.signin();
			break;
		case 2:
			System.out.println("Welcome u...");
		}
	}

	public static class Admin extends AdminParent {
		static String[] name;
		static int[] price;
		static int[] stock;

		public static void signin() // ADMIN SIGNIN METHOD
		{
			String adminarr[] = { "Jameel", "Afsar@123" };
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Signed Up username: ");
			String username = scan.nextLine();
			System.out.println("Enter Signed Up password: ");
			String password = scan.nextLine();
			if (username.equals(adminarr[0]) && password.equals(adminarr[1])) {
				System.out.println("Congrats...Admin signed in successfully!!");
				System.out.println("-----------------------------------------");
				Admin.choose();
			} else {
				System.out.println("Username or Password Mismatch!!");
				Admin.signin();
			}
		}

		public static void choose() {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. View Books");
			System.out.println("2. Add Books");
			System.out.println("3. Update Books");
			System.out.println("4. Delete Books");
			System.out.println("Select any of 4: ");
			int n1 = scan.nextInt();
			switch (n1) {
			case 1:
				Admin.view();
				break;
			case 2:
				Admin.add();
				break;
			case 3:
				Admin.update();
				break;
			case 4:
				// Admin.delete();
				break;
			default:
				System.out.println("Enter any of 4 only: ");
				break;
			}
		}

		public static void view() {
			if (name == null) {
				initializeObjects();
			}
			System.out.println("BookId" + "\tname" + "\tPrice" + "\tStock");
			for (int i = 1; i <= name.length; i++) {
				System.out.print(i + "\t" + name[i-1] + "\t" + price[i-1] + "\t" + stock[i-1] + "\n");
			}
			System.out.println("\n");
			Admin.choose();
		}

		public static void add() {
			Scanner scan = new Scanner(System.in);
			System.out.println("How many books do you want to add? ");
			int n = scan.nextInt();
			if (name == null) {
				initializeObjects();
			}
			System.out.println("Add Name, Price, Stock in order: ");
			String[] newName = new String[n];
			int[] newPrice = new int[n];
			int[] newStock = new int[n];
			for (int i = 0; i < n; i++) {
				newName[i] = scan.next();
				newPrice[i] = scan.nextInt();
				newStock[i] = scan.nextInt();
			}
			name = getBookNames(name, newName);
			price = getBookPrices(price, newPrice);
			stock = getBookStocks(stock, newStock);
			System.out.println("BookId" + "\tname" + "\tPrice" + "\tStock");
			for (int i = 1; i <= name.length; i++) {
				System.out.print(i + "\t" + name[i - 1] + "\t" + price[i - 1] + "\t" + stock[i - 1] + "\n");
			}
			Admin.choose();
		}
		public static void update()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Which book do you want to update: ");
			int newn=scan.nextInt();
			System.out.println("1."+name[newn]+"/t"+"2."+price[newn]+"/t"+"3."+stock[newn]+"/t");
			int num=scan.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("Enter new bookname: ");
					String updatename=scan.next();
					updatename=name[newn];
					break;
				case 2:
					System.out.println("Enter new price: ");
					int updateprice=scan.nextInt();
					updateprice=price[newn];
					break;
				case 3:
					System.out.println("Enter new price: ");
					int updatestock=scan.nextInt();
					updatestock=stock[newn];
					break;
					
			}
			Admin.choose();
		}
		public static void delete()
		{
			
		}
		
		

		private static void initializeObjects() {
			name = new String[3];
			name[0] = "C++";
			name[1] = "Java";
			name[2] = "Python";
			price = new int[3];
			price[0] = 300;
			price[1] = 400;
			price[2] = 500;
			stock = new int[3];
			stock[0] = 4;
			stock[1] = 5;
			stock[2] = 6;
		}

	}

	public static class AdminParent {
		public static String[] getBookNames(String[] name, String[] newName) {
			int size = newName.length + name.length;
			String[] nameUpdated = new String[size];
			for (int i = 0; i < size; i++) {
				if (i < name.length) {
					nameUpdated[i] = name[i];
				} else {
					nameUpdated[i] = newName[i - name.length];
				}
			}
			return nameUpdated;
		}

		public static int[] getBookPrices(int[] price, int[] newPrice) {
			int size = newPrice.length + price.length;
			int[] priceUpdated = new int[size];
			for (int i = 0; i < size; i++) {
				if (i < price.length) {
					priceUpdated[i] = price[i];
				} else {
					priceUpdated[i] = newPrice[i - price.length];
				}
			}
			return priceUpdated;
		}

		public static int[] getBookStocks(int[] stock, int[] newStock) {
			int size = newStock.length + stock.length;
			int[] stockUpdated = new int[size];
			for (int i = 0; i < stockUpdated.length; i++) {
				if (i < stock.length) {
					stockUpdated[i] = stock[i];
				} else {
					stockUpdated[i] = newStock[i - stock.length];
				}
			}
			return stockUpdated;
		}
	}
}