package workspace1103;

public class Fibonacci {
	
	public static int Fibonacci(int num) {
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		
		if (num == 0) return 1;
		if (num == 1) return 1;
		
		int result = Fibonacci(num-1) + Fibonacci(num-2);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(3));
		System.out.println(Fibonacci(5));
		System.out.println(Fibonacci(7));
		System.out.println(Fibonacci(10));
		System.out.println(Fibonacci(-1));

	}

}
