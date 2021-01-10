package workspace1103;

public class Factorial {
	
	public static int Factorial(int num) {
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		
		if (num == 0) {
			return 1;
		} else {
			int result = Factorial(num-1);
			return num * result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(1));
		System.out.println(Factorial(3));
		System.out.println(Factorial(5));
		System.out.println(Factorial(10));
		System.out.println(Factorial(-10));
	}
}
