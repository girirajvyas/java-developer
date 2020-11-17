package io.girirajvyas.questions;

/**
 * Q2: Find the output of given condition. String s1 = new String(); <br/>
 * String s2 = new String(); <br/>
 * s1 = "abc"; <br/>
 * s2 = "xyz"; <br/>
 * s1.concat(s2); <br/>
 * s2.concat(s1); <br/>
 * 
 * s1 + s2; <br/>
 * s2 + s1; <br/>
 * 
 * System.out.println("Testing String concat method : " + s1 + " " + s2); <br/>
 * 
 * Ans: As String is immutable its concat() method always returns a new instance
 * and we have to set it in another variable. If we don't set it in another
 * variable there is no effect on the result.
 * 
 * Hence we use StringBuffer(Thread-safe)/StringBuilder(NOT ThreadSafe) when we
 * have to do multiple concatenations
 * 
 * @author giri
 *
 */
public class StringQuestion2 {

	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String();
		s1 = "abc";
		s2 = "xyz";
		s1.concat(s2);
		s2.concat(s1);
		// s1 + s2; //compilation error: invalid Assignment Operator
		// s2 + s1; //compilation error: invalid Assignment Operator
		// ConcaT returns the concatenated string and that has the value, Result: String is immutable
		System.out.println("Testing String concat method : " + s1 + " " + s2);

		StringBuffer s3 = new StringBuffer("s1");// 
		StringBuffer s4 = new StringBuffer("s2");// 
		s3.append(s2 + "Me");// 
		s4.append(s1);
		System.out.println("Testing StringBuffer append method : " + s3 + " " + s4);

	}

}
