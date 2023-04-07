package uzuz1;


public class Js8 {

	public static void main(String[] args) {
		int result = sample();
			System.out.println(result);
	}
	private static int sample() {
		int val = 10;
		try {
			String[] array = {"A","B","C"};
			System.out.println(array[3]);
			
		} catch (RuntimeException e) {
			val += 20;
			return val;
			
		} finally {
			val = 100;
			
			System.out.println(val);
		}
		return val;
	}
}
