package Day8;

public class UtilityClass {
	    static class MathUtility {

	        static int square(int number) {

	            return number * number;
	        }

	        static int cube(int number) {

	            return number * number * number;
	        }
	    }

	    public static void main(String[] args) {

	        int number = 5;

	        int square = MathUtility.square(number);
	        int cube = MathUtility.cube(number);

	        System.out.println("Number: " + number);
	        System.out.println("Square: " + square);
	        System.out.println("Cube: " + cube);
	    }
	}
