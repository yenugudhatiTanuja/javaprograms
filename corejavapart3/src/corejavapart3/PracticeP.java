package corejavapart3;
class One extends Thread
{
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(i);
		}
	}
}
public class PracticeP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeP t=new PracticeP();
		t.call(new One());
	}
	public void call(One o) {
		o.start();
	}
}
