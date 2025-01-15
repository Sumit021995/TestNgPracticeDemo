package testPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Sumit");
		list.add(20);
		list.add(true);
		list.add(29.3);
		for(Object l:list)
		{
			System.out.println(l);
		}
		System.out.println("***********");
		String[] names= {"amit","sumit","aman","ankit"};
		List ls = Arrays.asList(names);
		System.out.println(Arrays.deepToString(names));
		System.out.println("***********");
		System.out.println(Arrays.toString(names));
		System.out.println("***********");
		
		for(Object l:ls)
		{
			System.out.println(l);
		}
		
		System.out.println("***********");
	}
}
