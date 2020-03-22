package oops;
import java.util.Scanner;

class Account{
	double Accno[];
	String Name[];
	double amt[];
	void info() {
		System.out.print("hi");
		
	}
	
	
}
class acc extends Account{
	void info() {
		System.out.println("type of account");
		
	}
	
	
	
}
class SB extends Account{
	int withdraw;
	int credit;
	double user;
	
	void info() {
	
	System.out.println("Extracting info of sb");
	
		
		int salary,amount,i;
		

		System.out.println("hello");
		
	
	}	
	
	
	
}
class currentACC extends Account{
	void info() {
	
	System.out.println("user has current Account");
	}
}
public class M3 {

	public static void main(String[] args) {
		Scanner sc
		= new Scanner(System.in);
		Account a = new Account();
		a.info();
		
		SB sb = new SB();
		sb.info();
		
		
		
		
		
		
	}

}
