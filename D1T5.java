import java.util.*;
public class D1T5{
	public static void main(String args[]){
		System.out.println("Enter no. of stu");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Student arr[]=new Student[n];
		for(int i=0;i<n;i++){
			String na=scan.next();
			int r=scan.nextInt();
			long pn=scan.nextLong();
			String a=scan.next();
			arr[i]=new Student(na,r,pn,a);
		}
			System.out.println("name  rollno phno address ");
	for(int i=0;i<n;i++)
		System.out.println(arr[i]);
	}	

}
class Student{
	String name;
	int rollno;
	long phno;
	String address;
	Student(String name,int rollno,long phno,String address){
		this.name=name;
		this.rollno=rollno;
		this.phno=phno;
		this.address=address;
	}
	public String toString(){
		return name+" "+rollno+" "+phno+" "+address;
	}
}