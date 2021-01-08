package io.girirajvyas.ds.list;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ListDemo {

	public static void main(String[] args) {
		LinkedList<String> strList = new LinkedList<>();
		
		strList.add("Giri");
		strList.add("Raj");
		strList.add("Vyas");
		strList.add(3, "NotSoGood");
		
		for (String str: strList) {
			System.out.println(str);
		}
		
		Predicate<String> predicate = (str) -> str.equals("me");
	}
}
