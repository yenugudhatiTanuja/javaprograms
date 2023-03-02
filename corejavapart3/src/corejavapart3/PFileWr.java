package corejavapart3;

import java.io.FileWriter;

public class PFileWr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("D:\\tanuja.txt");
			fw.write("welcome");
			fw.close();
			}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("success");
		}
	}


