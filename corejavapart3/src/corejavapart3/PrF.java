package corejavapart3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr;
		fr=new FileReader("D:\\tanuja.txt");
		int i;
		while((i=fr.read())!=-1)
		{
		System.out.print((char)i);
		}
		fr.close();
	}

}
