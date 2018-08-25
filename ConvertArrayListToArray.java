import java.util.ArrayList;
import java.util.Arrays;

/**
 * Java program to convert an array to ArrayList.
 * 
 * @author Mohammed
 *
 */
public class ConvertArrayListToArray {

	static void convertArrayToArraylist(String[] name) {
		System.out.println("Original String list:" + Arrays.toString(name));
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(name));
		System.out.println(list);
	}

	public static void main(String[] args) {
		String names[] = { "Java","Kali Linux","php", "C#", "Python", "C++" };
		convertArrayToArraylist(names);
	}

}
