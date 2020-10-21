package ReadInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {

		String pString = "Career";

		FileInputStream fs = new FileInputStream("./Exceel/sample.txt");

		Scanner sc = new Scanner(fs);
		int c = 0;
		while (sc.hasNextLine()) {
			Pattern pattern = Pattern.compile(pString);
			Matcher m = pattern.matcher(sc.nextLine());

			while (m.find()) {
				System.out.println(m.group().trim());
				c = c + 1;
			} // end of while		
		} // end while
		System.out.println("Found: " + c + " Times");
	}

}
