package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		InputStreamReader ir = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(ir);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}

	}

}
