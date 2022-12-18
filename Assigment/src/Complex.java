
public class Complex {
	int realNumber1;
	int imaginaryNumber1;

	int realNumber2;
	int imaginaryNumber2;
	

	public void getNumber1(int tmpReal1, int tmpImiginary1) {

		realNumber1 = tmpReal1;
		imaginaryNumber1 = tmpImiginary1;

	}

	public void getNumber2(int tmpReal2, int tmpImiginary2) {

		realNumber2 = tmpReal2;
		imaginaryNumber2 = tmpImiginary2;

	}

	public int sumReal() {

		return realNumber1 + realNumber2;

	}

	public int sumImaginary() {

		return imaginaryNumber1 + imaginaryNumber2;

	}
	public int diffReal() {
		return realNumber1 - realNumber2;
	}
	public int diffImaginary() {
		return imaginaryNumber1 - imaginaryNumber2;
		
	}
	public int prodReal() {
		return (realNumber1*realNumber2)-(imaginaryNumber1*imaginaryNumber2);
	}
	public int prodImaginary() {
		return (realNumber1*imaginaryNumber2)+(realNumber2*imaginaryNumber1);
	}

}
