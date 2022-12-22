package org.gi.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RwProgram
{

	public static void main(String[] args)
	{
		 writeToFile();
		readToFile();

	}

	private static void readToFile()
	{
		FileInputStream fileInputStream = null;
		try {
			File objFile= new File("C:\\Rutu\\danny\\OMrum\\First.txt");
			fileInputStream = new FileInputStream("C:\\Rutu\\danny\\OMrum\\First.txt");
			byte[] data = new byte[(int)objFile.length()];
			fileInputStream.read(data);
			String str = new String(data);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private static void writeToFile()
	{
		// write to file
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("C:\\Rutu\\danny\\OMrum\\First.txt");
			String data = "Welcome to the file applications , this is the first file created....";
			fileOutputStream.write(data.getBytes());
			System.out.println("File written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
