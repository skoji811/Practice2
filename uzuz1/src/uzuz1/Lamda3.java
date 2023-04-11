package uzuz1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamda3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Consumer <String> con = s -> System.out.println("hello!"+s+"!");
		
		con.accept("Sakakibara");
		
		Supplier<String> sup = () -> "Hello";
		
		System.out.println(sup.get());
		
 
	

		
		Predicate<String> pre = s -> s.length()>10;
		System.out.println(pre.test("abcdefghijk"));
		System.out.println(pre.test("abcde"));
	
		Function<String,Integer> fun = a -> Integer.parseInt(a);
		System.out.println(fun.apply("123"));
	}	
}
