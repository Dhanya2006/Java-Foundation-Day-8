package Day8;

public class ThisKeyword {
	static class Rectangle{
		double length;
		double width;
		Rectangle(double length,double width){
			this.length=length;
			this.width=width;
		}
		double calculation() {
			return this.length*this.width;
		}
	}

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(10,5);
		System.out.println("length:" + rectangle.length);
		System.out.println("width:" + rectangle.width);
		System.out.println("area:" + rectangle.calculation());

	}

}
