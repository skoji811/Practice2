package uzuz1;

public class Js2 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int array [][] = new int[][] {{1,2},{2,3,4}};
		int  total = 0;
		for (int i = 0 ; i < array.length; i++) {
			for(int j = 0; j< array.length; j++) {
				total += array[i][j];
				}
			}
		System.out.println(total);
	}

}
