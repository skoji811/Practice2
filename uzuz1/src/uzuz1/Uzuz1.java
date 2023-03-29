package uzuz1;

public class Uzuz1 {

		
	public static void main (String[] args) {
		
		/* (1) 以下の配列を準備してください。
		**     配列名    ：names
		**     保持する値：「taro」「takeshi」「hanako」「moco」「satoshi」
		*/
		String[] names = {"taro","takesh","hanako","moco","satoshi"};	
		
		
		
		/* (2) 以下のアンダーバーを埋め、
		**     names配列から「moco」の値を表示するプログラムに修正してください。
		*/
		String printName = names[3] ;         //(21行目)アンダーバーに適切な処理を埋めてください
		System.out.println( printName );    //(22行目)変更しないでください
		
		
		/* 以下の配列を準備し、「トイプードル」が表示されるプログラムを作成してください。
		**     配列名    ：animals
		**     保持する値
		**        animals[0][0]：アメリカンショートヘア
		**        animals[0][1]：マンチカン
		**        animals[1][0]：ジャンガリアンハムスター
		**        animals[1][1]：ハリネズミ
		**        animals[2][0]：オカメインコ
		**        animals[2][1]：ブンチョウ
		**        animals[3][0]：ゴールデンレトリーバー
		**        animals[3][1]：トイプードル
		*/
		
		String [][] animals = {{"アメリカンショートヘア","マンチカン"},{"ジャンガリアンハムスター","ハリネズミ"},
		{"オカメインコ","ブンチョウ"},{"ゴールデンレトリーバー","トイプードル"}};
		
		String animalName = animals[3][1];
	   System.out.println(animalName);
	   
	  	}
	
	コマンドライン引数として３つの数値を受け取り、その合計値を
	表示するプログラムを作成してください。
	<例>
	コマンドライン入力値：5 8 10
	表示される値：23
	----------------------------------------------------*/
	class Ex1_08_3 {
		public static void main (String[] args) {
			
			int input1 = ______________ ;                      //(11行目)アンダーバーに適切な処理を埋めてください
			int input2 = ______________ ;                      //(12行目)アンダーバーに適切な処理を埋めてください
			int input3 = ______________ ;                      //(13行目)アンダーバーに適切な処理を埋めてください
			                                                   
			System.out.println( input1 + input2 + input3 );    //(15行目)変更しないでください
			
}

