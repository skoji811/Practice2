package uzuz1;

public class Lamda2 {
	interface Test{
		String process();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Test t = () -> "hello";
		System.out.println(t.process());
	}

}
