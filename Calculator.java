class myCalc {
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	void execute(int a, int b) {
		int result = add(a, b);
		print(result);
	}
	void print(int a) {
		String str = Integer.toString(a);
		System.out.println(str);
	}
}
public class Calculator {
	public static void main(String[] args) {
		myCalc cal = new myCalc();
		cal.execute(10, 5);
	}
}
