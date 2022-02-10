package gyub.backjoon.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		String [] array = {"2BA", "1BA"};
		
		int [] arr = {2, 1 ,3 ,5, 6};
		
		Arrays.sort(arr);
		
		for(String str : array) {
			System.out.println(str);
		}
		
	}

}
