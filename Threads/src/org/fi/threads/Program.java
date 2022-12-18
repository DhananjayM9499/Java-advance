package org.fi.threads;
public class Program
{

	public static void main(String[] args) throws Exception
	{
		Data objData = new Data();
		Thread incThread=new Thread(new IncrementThread(objData));
		Thread decThread=new Thread(new DecrementThread(objData));
		
		
		decThread.start();
		incThread.start();
}
}
