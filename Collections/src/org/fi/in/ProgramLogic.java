package org.fi.in;

import java.util.Iterator;

public  class ProgramLogic
{
	public static void display(Iterator<String> iterator)
	{
		while (iterator.hasNext()) {
			String data = iterator.next();
			if (data.equals("sid")) {
				iterator.remove();
				break;
			}
		}
	}

}
