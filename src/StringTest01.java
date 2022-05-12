
public class StringTest01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "apple";
		String str2;
		str2 = str1;
		str1 = "orange";
		System.out.println(str1);
		System.out.println(str2);
		
		String a = "applePie";
		String d = "apple";
		String e = d + "Pie";
		Boolean c;
		c = a == e;
		System.out.println(a);
		System.out.println(d);
		System.out.println(e);
		System.out.println(c);
	}

}
