
public class Recursive {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 1;
		number = printNum(number);
		// System.out.println("return = " + number);
	}
	
	public static int printNum(int number) {
		if (number < 50) {
			number *= 2;
			System.out.println(number);
			printNum(number);
		}
		System.out.println("return = " + number);
		return number;
	}

}
