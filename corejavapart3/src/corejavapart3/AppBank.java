package corejavapart3;

import java.util.Scanner;

class Account 
{
	public int accountno;
	public int balance=0;
	 synchronized void  deposit(int amount)
	{
		int depositmoney=amount;
	    balance=balance+depositmoney;
	    System.out.println("After Deposit");
	    mainbalance();
	}
	synchronized void withdraw(int amount)
	{
		if(balance>amount)
		{
		int withdrawmoney=amount;
		balance=balance-withdrawmoney;
		System.out.println("after withdraw");
		mainbalance();
		}
		else
		{
			System.out.println("Insufficient funds\n *** your Account details***");
		    mainbalance();
		}
	}
	void mainbalance()
	{
		//System.out.println("MainBalance");
		System.out.println("Account number---->"+accountno+"\t\tBalance---->"+balance);
	}
	
}
class MyThread extends Thread
{
	int amount;
	Account accountX;
	MyThread(Account x,int amount)
	{
		accountX=x;
		this.amount=amount;
		this.start();

	}
	public void run()
	{
		accountX.deposit(amount);
	}
}
class MyThreadWithdraw extends Thread
{
	int amount;
	Account accounty;
	MyThreadWithdraw(Account y,int amount)
	{
		accounty=y;
		this.amount=amount;
		this.start();

	}
	public void run()
	{
		accounty.withdraw(amount);
	}  
}
public class AppBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account obj=new Account();
      Scanner s=new Scanner(System.in);
      System.out.println("Enter deposit amount");
      int f=s.nextInt();
      System.out.println("Enter withdraw amount");
      int h=s.nextInt();
      System.out.println("Enter account number");
      int g=s.nextInt();
      obj.balance=1000;
      obj.accountno=g;
      MyThread t1;
      MyThreadWithdraw t2;
      t1=new MyThread(obj,f);
      t2=new MyThreadWithdraw(obj,h);
    		  
	}

}
