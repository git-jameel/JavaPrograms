
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
			System.out.println("5. Exit");
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
				Admin.delete();
				break;
			case 5:
				break;
			default:
				System.out.println("Enter any of 5 only: ");
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
			price = getBookPricesOrStocks(price, newPrice);
			stock = getBookPricesOrStocks(stock, newStock);
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
			System.out.println("1."+name[newn-1]+"  "+"2."+price[newn-1]+"  "+"3."+stock[newn-1]);
			int num=scan.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("Enter new bookname: ");
					String updatename=scan.next();
					name[newn-1]=updatename;
					System.out.println("Updated sucessfully..");
					break;
				case 2:
					System.out.println("Enter new price: ");
					int updateprice=scan.nextInt();
					price[newn-1]=updateprice;
					System.out.println("Updated sucessfully..");
					break;
				case 3:
					System.out.println("Enter new stock: ");
					int updatestock=scan.nextInt();
					stock[newn-1]=updatestock;
					System.out.println("Updated sucessfully..");
					break;
					
			}
			Admin.choose();
		}
		public static void delete()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the book id u want to delete: ");
			int id=scan.nextInt();
			name = deleteName(id, name);
			price = deletePriceOrStock(id, price);
			stock = deletePriceOrStock(id, stock);
			System.out.println("deleted sucessfully..");
			Admin.choose();
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

		public static int[] getBookPricesOrStocks(int[] price, int[] newPrice) {
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

	}
	
	public static String[] deleteName(int id, String[] name) {
			    String[] afterDeletedNameArray = new String[name.length - 1];
			    for(int i=0, j=0;i<name.length;i++) {
			        if(i == (id-1)) {
			            continue;
			        }
			           afterDeletedNameArray[j++] = name[i];
			        
			}
			return afterDeletedNameArray;
        }
       
        public static int[] deletePriceOrStock(int id, int[] priceOrStock) {
			    int[] afterDeletedPriceOrStock = new int[priceOrStock.length -1];
			    for(int i=0, j=0;i<priceOrStock.length;i++) {
			        if(i == (id-1)) {
			            continue;
			        }
			     afterDeletedPriceOrStock[j++] = priceOrStock[i];
			}
			return afterDeletedPriceOrStock;
        }
        
}
