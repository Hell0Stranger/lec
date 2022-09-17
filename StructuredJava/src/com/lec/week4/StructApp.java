package com.lec.week4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class StructApp {

	public static void main(String[] args) throws IOException {

		Member member = new Member();
		
		member.kor = 10;
		member.eng = 20;
		member.math = 30;
		
		System.out.println(member.kor);
		System.out.println(member.eng);
		System.out.println(member.math);
		
	}
}
