package uzuz1;

public class Lamda1 {
		interface Test{
			void process(int x);
		}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Test t = (x) ->  System.out.println(x);
		t.process(10);
	}

}