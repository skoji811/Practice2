package uzuz1;

public class Ja10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//			Function f = (name) ->{
//				return " hello, " + name;
//			};  →正しい構文
			
//   		    Fuction f = (name) -> {
//				"hello,"  +  name;
//			};　→　間違い　returnの記述が必要
			
//			Function f = (name) -> return "hello, " + name →　間違い　中括弧を省略しているので　return　の記述の必要なし
					
//			Function f = (name) -> "hello, " + name;　　　→正しい構文
		
//			Function f = name ->{
//				return "hello, " + name;
//			};　　　→正しい構文　関数型インターフェースの型　＋　変数名　変数名には（）入れなくても良い。

		
		
		System.out.println(f.test("Koji"));
	}
		private static interface Function{
			String test (String name);
		}
}
