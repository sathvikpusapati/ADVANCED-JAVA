package SCANNER_CLASS;

import java.util.Scanner;

public class scanneer1 {

	public static void main(String []a)
	{
		Scanner sd=new Scanner(System.in);
		
		System.out.println("enter a number\n");
		
		int num=sd.nextInt();
		
		System.out.println(num);
		
      System.out.println("enter a character\n");
		
		String cd=sd.next();
		
		System.out.println(cd);
		
		 sd.nextLine();
		
      System.out.println("enter a sentence\n");
		
		String ss=sd.nextLine();
		
		System.out.println(ss);
		
		/*
		 * When you use methods like nextInt() or next() to read a number or a single
		 * word, they do not consume the newline character (\n) that is created when you
		 * press "Enter." As a result, when you try to use nextLine() afterward to read
		 * a full sentence, it will immediately read that leftover newline character
		 * instead of waiting for you to input a new sentence.
		 */
		
	}
}
