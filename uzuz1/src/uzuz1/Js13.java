package uzuz1;

public class Js13 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample s = new Sample();
		s.setValue("Java");
		System.out.println(s.toString());

	}
	
	public class Sample{
		private String value;
		public void setValue(String value) {
			value = "Hello, " + value;
		}
		public String toString() {
			return value;
		}
	}
	


}
