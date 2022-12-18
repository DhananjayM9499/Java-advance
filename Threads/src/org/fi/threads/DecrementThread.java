package org.fi.threads;

public class DecrementThread implements Runnable
{
	Data objData;

	public DecrementThread(Data objData)
	{
		super();
		this.objData = objData;
	}

	@Override
	public void run()
	{
	try {
		while(true)
		{
			synchronized (objData) 
			{
		System.out.println("%%%%% Decrement"+objData.value--);
		Thread.sleep(50);
			}
		}
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
		
	}

}
