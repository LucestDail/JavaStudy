
public class ComputerExample {
	int sum1(int ... values) {
		int sum = 0;
		for(int item : values) {
			sum += item;
		}
		return sum;
	}

}
