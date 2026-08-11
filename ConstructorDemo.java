package Day8;

public class ConstructorDemo {
	static class person{
		String name;
		int age;
		person(String name,int age){
			this.name=name;
			this.age=age;
		}
		void display() {
			System.out.println("name:" + name);
			System.out.println("age:" + age);
		}
	}

	public static void main(String[] args) {
		person person = new person("dhanya",20);
		person.display();
		

	}

}
