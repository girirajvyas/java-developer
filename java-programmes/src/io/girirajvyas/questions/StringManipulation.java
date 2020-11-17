package io.girirajvyas.questions;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String input = "cardio, push ups, arms,legs";
		String expectedOutput = "(cardio) OR (push AND ups) OR (arms) OR (legs)";
		StringBuilder output = new StringBuilder();

		String[] strings = input.split(",");

		for (int i = 0; i < strings.length; i++) {
			String s = strings[i].trim();
			if (s.contains(" ")){
				s = s.replaceAll(" ", " AND ");
			}
			output.append("(").append(s).append(")");
			if (i != strings.length - 1) {
				output.append(" OR ");
			}
		}
		System.out.println(output);
		System.out.println(output.toString().equals(expectedOutput));
	}

}
