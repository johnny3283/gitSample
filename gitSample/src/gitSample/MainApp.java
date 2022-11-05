package gitSample;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("2nd Version");
		Math cMath = new Math();
		System.out.println();
		System.out.print(cMath.add(5, 5));		
	}
}

class Math {
	int add(int x, int y) {
		return x + y;
	}
}