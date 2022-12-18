package org.fi.in;

import org.fi.utility.ConsoleInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOp
{

	public static void main(String[] args)
	{
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String data = scanner.next();
			int age = scanner.nextInt();
			System.out.println(data);
			System.out.println(age);

		} finally {
			if (scanner != null)
				scanner.close();
		}

	}

	private static void readUsingDIS()
	{
		DataInputStream dataInputStream = null;
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("C:\\New folder\\Test1.txt");
			dataInputStream = new DataInputStream(fileInputStream);
			try {
				while (true) {
					String name = dataInputStream.readUTF();
					int age = dataInputStream.read();
					float salary = dataInputStream.readFloat();
					System.out.println(name);
					System.out.println(age);
					System.out.println(salary);
				}
			} catch (EOFException e) {

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (dataInputStream != null)
					dataInputStream.close();
				if (fileInputStream != null)
					fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void writeUsingDIS()
	{
		DataOutputStream dataOutputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream("C:\\New folder\\Test1.txt", true);
			dataOutputStream = new DataOutputStream(fileOutputStream);
			int choice = 1;
			while (choice != 5) {
				System.out.println("Enter choice, 5 to exit");
				choice = ConsoleInput.getInteger();
				System.out.println("Enter the name");
				String name = ConsoleInput.getString();
				System.out.println("Enter age");
				int age = ConsoleInput.getInteger();
				System.out.println("Enter the  salary");
				float salary = ConsoleInput.getFloat();
				dataOutputStream.writeUTF(name);
				dataOutputStream.writeInt(age);
				dataOutputStream.writeFloat(salary);
			}
			System.out.println("File Written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dataOutputStream != null)
					dataOutputStream.close();
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void encryption()
	{
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			File objFile = new File("C:\\New folder\\Test1.txt");
			fileInputStream = new FileInputStream(objFile);
			fileOutputStream = new FileOutputStream("C:\\New folder\\Test1.enc");

			byte[] data = new byte[(int) objFile.length()];
			fileInputStream.read(data);
			byte[] encData = new byte[data.length];
			for (int iTmp = 0; iTmp < data.length; iTmp++)
				encData[iTmp] = (byte) (data[iTmp] + 15);
			fileOutputStream.write(encData);
			System.out.println("File Encrypted");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void decryption()
	{
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			File objFile = new File("C:\\New folder\\Data.enc");
			fileInputStream = new FileInputStream(objFile);
			fileOutputStream = new FileOutputStream("C:\\New folder\\Data1.txt");

			byte[] data = new byte[(int) objFile.length()];
			fileInputStream.read(data);
			byte[] encData = new byte[data.length];
			for (int iTmp = 0; iTmp < data.length; iTmp++)
				encData[iTmp] = (byte) (data[iTmp] - 15);
			fileOutputStream.write(encData);
			System.out.println("File Decrypted");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void readFromFile()
	{
		FileInputStream fileInputStream = null;
		try {
			File objFile = new File("C:\\New folder\\Test1.txt");
			fileInputStream = new FileInputStream("C:\\New folder\\Test1.txt");
			byte[] data = new byte[(int) objFile.length()];
			fileInputStream.read(data);
			String str = new String(data);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	private static void writeToFile() {
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream=new FileOutputStream("C:\\New folder\\Test1.txt",true);
			String data ="welcome toh the files applicatiom this is first class";
			fileOutputStream.write(data.getBytes());
			System.out.println("file written");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fileOutputStream!=null)
					fileOutputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		 
	}

}







