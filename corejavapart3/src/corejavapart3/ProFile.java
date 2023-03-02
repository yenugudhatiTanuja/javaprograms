package corejavapart3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    BufferedReader reader=null;
    int charCount=0;
    int wordCount=0;
    int lineCount=0;
    	reader=new BufferedReader(new FileReader("D:\\tanuja.txt"));
    	String currentLine=reader.readLine();
    	while(currentLine!=null)
    	{
    		lineCount++;
    		String[] words=currentLine.split(" ");
    		wordCount = wordCount+words.length;
    		for(String word :words)
    		{
    			charCount=charCount+word.length();
    			
    		}
    		currentLine=reader.readLine();
    	}
    	System.out.println("Number of character in file: "+charCount);
    	System.out.println("Number of word in file: "+wordCount);
    	System.out.println("Number of line in file: "+lineCount);
        reader.close();

    }
    
}
