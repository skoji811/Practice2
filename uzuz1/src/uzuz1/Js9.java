package uzuz1;

import java.io.FileWriter;
import java.io.IOException;

public class Js9 {

	public static void main(String[] args) {

		        try(FileWriter fw = new FileWriter("/sample.txt");) {
		            fw.write("sample");
		        }catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
