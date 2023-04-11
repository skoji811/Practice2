package uzuz1;

public class Js11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		byte a = 10;
		
		System.out.println(a);
		
		short b = 20;
//		a = b; 型変換　コンパイルエラー
		a = (byte)b;
		System.out.println(a);
		
		int c = 30;
//		a = b;　
//		a = c;
//		b = c; 型変換　コンパイルエラー
		a = (byte)b;
		a = (byte)c;
		b = (short)c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		long d = 40;
		a = (byte)d;
		b = (short)d;
		c = (int)d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
		
		
	}

}
