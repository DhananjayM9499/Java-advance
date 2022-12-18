package org.fi.threads;

public class IncrementThread implements Runnable
{
	Data objData;

	public IncrementThread(Data objData)
	{
		super();
		this.objData = objData;
	}

	@Override
	public void run()
	{
		int count = 0;
		try {
			while (true) {
				synchronized (objData) 
				{
                          if(count>=10) 
                          {
                        	  count=0;
                        	  objData.notifyAll();
                          }
					System.out.println("----Increment" + objData.value++);
					Thread.sleep(20);
				}
				count++;
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("*************leaving increment method");
	}
}
