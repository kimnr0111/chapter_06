package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneDBApp {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];
			System.out.println("이름:" + name);
			System.out.println("휴대폰:" + hp);
			System.out.println("회사:" + company);
			System.out.println("");
		}

	}

}
