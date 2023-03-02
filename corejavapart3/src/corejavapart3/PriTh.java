package corejavapart3;

public class PriTh extends Thread {
	public void run()
	{
		System.out.println("Running Thread Name:--->"+this.currentThread().getName());
		System.out.println("Running Thread Priority:------>"+this.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriTh priority1=new PriTh();
		priority1.setName("FirstThread");
		priority1.setPriority(MIN_PRIORITY);
		PriTh priority2=new PriTh();
		priority2.setName("SecondThread");
		priority2.setPriority(MAX_PRIORITY);
		PriTh priority3=new PriTh();
		priority3.setName("ThirdThread");
		priority3.setPriority(NORM_PRIORITY);
		PriTh priority4=new PriTh();
		priority4.setName("FourthThread");
		priority4.setPriority(7);
		priority1.start();
		priority2.start();
		priority3.start();
		priority4.start();

	}

}
