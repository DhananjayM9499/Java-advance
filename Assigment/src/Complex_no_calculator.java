
public class Program_3 {

	public static void main(String[] args) {

		Complex complex = new Complex();
		char Choice;
do {
		System.out.println("----------Complex Arithmetics-------");
		System.out.println("1.Sum\n2.Difference\n3.product");
		char choice = ConsoleInput.getString().charAt(0);
		
			switch (choice) {
			case '1':
				System.out.println("You choose Summation");
				System.out.println("Enter first real Number ");
				int real = ConsoleInput.getInteger();
				System.out.println("Enter first Imaginary Number ");
				int imaginary = ConsoleInput.getInteger();
				complex.getNumber1(real, imaginary);

				System.out.println("Enter second real Number ");
				int Real = ConsoleInput.getInteger();
				System.out.println("Enter second Imaginary Number ");
				int Imaginary = ConsoleInput.getInteger();
				complex.getNumber2(Real, Imaginary);

				System.out.println("The first Complex number is : ");
				System.out.println(real + " + " + imaginary + "i");

				System.out.println("The Second Complex number is : ");
				System.out.println(Real + " + " + Imaginary + "i");

				System.out.println("The addition of the real number is : " + complex.sumReal() + " + "
						+ complex.sumImaginary() + "i");

				break;

			case '2':
				System.out.println("Enter first real Number ");
				real = ConsoleInput.getInteger();
				System.out.println("Enter first Imaginary Number ");
				imaginary = ConsoleInput.getInteger();
				complex.getNumber1(real, imaginary);

				System.out.println("Enter second real Number ");
				Real = ConsoleInput.getInteger();
				System.out.println("Enter second Imaginary Number ");
				Imaginary = ConsoleInput.getInteger();
				complex.getNumber2(Real, Imaginary);

				System.out.println("The first Complex number is : ");
				System.out.println(real + " + " + imaginary + "i");

				System.out.println("The Second Complex number is : ");
				System.out.println(Real + " + " + Imaginary + "i");

				System.out.println("The addition of the real number is : " + complex.diffReal() + " + "
						+ complex.diffImaginary() + "i");

				break;

			case '3' :
				System.out.println("Enter first real Number ");
				real = ConsoleInput.getInteger();
				System.out.println("Enter first Imaginary Number ");
				imaginary = ConsoleInput.getInteger();
				complex.getNumber1(real, imaginary);

				System.out.println("Enter second real Number ");
				Real = ConsoleInput.getInteger();
				System.out.println("Enter second Imaginary Number ");
				Imaginary = ConsoleInput.getInteger();
				complex.getNumber2(Real, Imaginary);

				System.out.println("The first Complex number is : ");
				System.out.println(real + " + " + imaginary + "i");

				System.out.println("The Second Complex number is : ");
				System.out.println(Real + " + " + Imaginary + "i");
				System.out.println("The product of the give complex number is : "+ complex.prodReal()+" + "+complex.prodImaginary()+"i");
                break;
                
				default:
					System.out.println("Invalid input");
					System.exit(0);
					break;
			}
			System.out.println("Do you want to continue (Y/N)");
            Choice =ConsoleInput.getString().charAt(0);
            
		}
		while (Choice == 'y' || Choice == 'Y');
		{
			System.out.println("Bye Have a good day");

		}

	}

}
