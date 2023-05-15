package uzuz1;

public class Js14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	       int[] array = { 10, 20, 30 };
	        int arrayCopy[] = array;
	        array[0] = 0;
	        System.out.println(arrayCopy[0]);
	        
	        String[] array1 = { "A","B","C"};
	        String arrayCopy1[] = array1;
	        array1[0] = "D";
	        System.out.println(arrayCopy1[0]);
//			char[][] array2 = {{"a","b"},{"c","d"}};
//			char[][] array3 = array2.clone();
//			char[][] array4 = array2.clone();
//			array2[1] == array3[1];
	
			int[] arrayA = { 10, 20, 30 };
			int arrayCopyA[] = arrayA.clone();
			arrayA[0] = 0;
			System.out.println(arrayCopyA[0]);
    
			String[] array2 = { "A","B","C"};
			String arrayCopy2[] = array2.clone();
			array2[0] = "D";
			System.out.println(arrayCopy2[0]);
}
}

	
