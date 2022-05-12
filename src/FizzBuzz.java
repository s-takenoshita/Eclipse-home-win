
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int number = 1; number <= 100; number++) {
			int surplus3 = number % 3;
			int surplus5 = number % 5;
			if (surplus3 == 0 && surplus5 != 0) {
				System.out.println("Fizz = " + number);
			}
			if (surplus3 != 0 && surplus5 == 0) {
				System.out.println("Buzz = " + number);
			}
			if (surplus3 == 0 && surplus5 == 0) {
				System.out.println("FizzBuzz = " + number);
			}
			if (surplus3 != 0 && surplus5 != 0) {
				System.out.println(number);
			}
		}
	}

}
