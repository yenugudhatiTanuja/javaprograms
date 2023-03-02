package corejavapart3;

/*public class ThClaPro extends Thread{

	public void run()
	{
		System.out.println("thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThClaPro t=new ThClaPro();
       t.run();
       t.start();
	}

}*/
 class Thread1 implements Runnable{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("thread1----->"+i);
		}
	}
 }
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=6;i<10;i++)
		{
		System.out.println("thread2----->"+i);
		}
	}
}
public class ThClaPro
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread1 s1=new Thread1();
       Thread t1=new Thread(s1);
       //t1.start();
       Thread2 s2=new Thread2();
       Thread t2=new Thread(s2);
       t1.start();
       t2.start();
      // t2.start();
	}

}