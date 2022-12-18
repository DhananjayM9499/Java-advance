
public class Rectangle {
	int base;
	int height;
	float area;
	
	public float area(int tmpBase,int tmpHeight) {
		base=tmpBase;
		height=tmpHeight;
	return area =  0.5f*(base*height);
	}
	public void display() {
		System.out.println("Base of the rectangle is "+base+"\n Height of the rectangle is "+ height );
		System.out.println("Area of the rectangle is"+area);
	}
	
	

}
