package Day8;

public class StaticCounter {
	static class Counter{
		static int count=0;
		Counter(){
			count++;
		}
		static void displaycount() {
			System.out.println("Number of object:" + count);
			
		}
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter.displaycount();

	}

}
