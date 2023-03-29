package uzuz1;

public class Sample{
private int num;
public Sample(int num){
this.num = num;
}
//Objectクラスじゃない
public boolean equals(Sample obj){
if( obj == null){
return false;
}
return this.num == obj.num;
}
}
//このクラスを利用する以下のプログラムを、コンパイル、実行したときの結果として、正しいものを選べ。
public class Main{
public static void main(String[] args){
// 異なる参照aとｂ。
Object a = new Sample(10);
Object b = new Sample(10);
System.out.println(a.equals(b));
}
}
