package com.javaex.ex05;

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

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		Reader fr = new FileReader("C:\\javastudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
			String line = br.readLine();
			
			if (line==null) {
				break;
			}
			
			String[] dArray = line.split(",");
			
			String name = dArray[0];
			String hp = dArray[1];
			String company = dArray[2];
			
			Person p01 = new Person(name, hp, company);
			pList.add(p01);
		}
		
		String my = sc.nextLine();
		String[] dArray = my.split(",");
		
		String name = dArray[0];
		String hp = dArray[1];
		String company = dArray[2];
		
		Person p01 = new Person(name, hp, company);
		pList.add(p01);
		
		Writer fw = new FileWriter("C:\\javastudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i = 0; i<pList.size(); i++) {
			String str = pList.get(i).getName()+","+pList.get(i).getHp()+","+pList.get(i).getCompany()+",";
			bw.write(str);
			bw.newLine();
		}
		
		
		br.close();
		bw.close();
		sc.close();

	}

}
