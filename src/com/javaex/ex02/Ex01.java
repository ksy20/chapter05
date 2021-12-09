package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javastudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);//in은 연결고리
		
		OutputStream out = new FileOutputStream("C:\\javastudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			int data = bin.read();
			
			if(data==-1) {
				System.out.println("복사가 완료되었습니다."+data);
				break;
			}
			bout.write(data);
		}
		
		//in.close();
		bin.close();
		//out.close();
		bout.close();
	}

}
