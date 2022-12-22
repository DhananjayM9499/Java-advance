package org.fi.pfi;

import java.util.function.Supplier;

public class Digits
{

	public static void main(String[] args)
	{
		Supplier<String[]> randomNumber = () -> {
			while (true) {
				int pos = (int) (Math.random() * 4);
				String otp = String.valueOf(pos);
				for (int iTmp = 0; iTmp < 2; iTmp++)
					otp += (int) (Math.random() * 9);
				System.out.println(otp);
				

				break;

			}
			return args;

		};

		String[] numbers = randomNumber.get();
		for (String str : numbers)
			System.out.println(str);

	}

}