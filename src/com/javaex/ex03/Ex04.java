package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader ("C:\\javastudy\\file\\PhoneDB_원본2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			String str = br.readLine();
			
			if (str==null) {
				break;
			}
			
			String[] dArray = str.split(",");
			
			String name = dArray[0];
			String hp = dArray[1];
			String company =dArray[2];
				
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println(" ");

		}
		
//		Writer fw = new FileWriter("C:\\javastudy\\file\\PhoneDB_원본2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		
//		bw.write("이효리,010-2222-3333,031-2323-4441");
//		bw.newLine();
//		bw.write("정우성,010-2323-2323,02-5555-5555");
//		bw.newLine();
//		bw.write("이정재,010-9999-9999,02-8888-8888");
//		bw.newLine();
//		bw.write("강소이,010-2222-3333,02-2222-3333");
//		bw.newLine();
//		
//		bw.close();
		br.close();
	}

}
