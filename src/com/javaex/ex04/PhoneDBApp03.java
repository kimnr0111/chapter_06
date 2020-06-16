package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDBApp03 {

	public static void main(String[] args) throws IOException {

		//읽기먼저 실행
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<PhoneApp> pList = new ArrayList<PhoneApp>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];
			pList.add(new PhoneApp(name, hp, company));
//			System.out.println("이름:" + name);
//			System.out.println("휴대폰:" + hp);
//			System.out.println("회사:" + company);
//			System.out.println("");
		}
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//쓰기 실행
		
		for(int i=0;i<pList.size();i++) {
			bw.write(pList.get(i).Info());
			
			bw.newLine();
		}
		System.out.println("개인정보입력");
		bw.write(sc.nextLine());
		
		bw.close();
		br.close();

	}

}
