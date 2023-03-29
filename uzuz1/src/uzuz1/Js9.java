package uzuz1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Js9 {

	public static void main(String[] args) {
		// メソッドを呼ぶ側
		FileTest.read();
	}
}
class FileTest {
// メソッドが呼ばれる側
static void read()  {
	String dir = "D:\\workspace";
	String filename = "test2.txt";
	// 存在しないファイルを読みに行って例外(IOException)が発生
	try {
		List<String> line = Files.readAllLines(Paths.get(dir, filename),
			Charset.forName("SHIFT_JIS"));
	} catch (IOException e) {
		e.printStackTrace();
	} 
}
}
