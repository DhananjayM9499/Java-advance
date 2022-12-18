package org.gi.io;

import java.io.File;

public class Program
{

	public static void main(String[] args)
	{
		try {
		 //Create a file****************************
//			 File objFile = new File("C:\\New folder\\First.txt");
//			 objFile.createNewFile();
//			 System.out.println("File created");
		// Delete a file*******************
//			 File objFile = new File("C:\\New folder\\First.txt");
//			 objFile.delete();
//			 System.out.println("File Deleted");
		// list of files*****************************
//			File objFile = new File("C:\\New folder");
//			String[]fileNames=objFile.list();
//			for (String names : fileNames) {
//				System.out.println(names);
//			}
		// Listing and knowing the type dir or file
//			File objFile1 = new File("C:\\New folder");
//			File[] arrFiles = objFile1.listFiles();
//			for (File file : arrFiles) {
//				if (file.isDirectory()) {
//					System.out.println("[" + file.getName());
//					long modifiedMillis = file.lastModified();
//					Date dt = new Date(modifiedMillis);
//					System.out.println(dt.toString());
//				} else {
//					long modifiedMillis = file.lastModified();
//					Date dt = new Date(modifiedMillis);
//					System.out.println(dt.toString());
//					System.out.println(file.getName());
//				}
//			}
		//Make Directories=mkdirs Make directory(single)=mkdir
//			File objFile = new File("C:\\Rutu\\danny\\OMrum");
//			objFile.mkdir();
		//create file in the directory
//			File objFile = new File("C:\\Rutu\\danny\\OMrum\\30ml.txt");
//			objFile.createNewFile();
		
			
		} catch (Exception e) {

		}

	}

}
