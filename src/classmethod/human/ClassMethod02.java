package classmethod.human;

public class ClassMethod02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human02 sato = new Human02("sato", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}

}
