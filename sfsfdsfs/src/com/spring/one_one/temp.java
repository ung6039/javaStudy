package com.spring.one_one;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class temp {

	public static void base64(){
		String text ="햇반";
		try{
			String temp = URLEncoder.encode(text, "UTF-8");
			System.out.println("!! "+temp);
			temp = URLDecoder.decode(text,"MS949");
			System.out.println("??"+temp);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		byte[] target_Byte = text.getBytes();
		System.out.println(text);
		System.out.println(new String(target_Byte));
		// 인코딩
		Encoder encoder = Base64.getEncoder();
		byte[] encoderBytes =encoder.encode(target_Byte);
		System.out.println("인코딩 : "+new String(encoderBytes));
		Decoder decoder = Base64.getDecoder(); 
		byte[] decoderBytes	= decoder.decode(encoderBytes);
		
		System.out.println("디코딩 :"+new String(decoderBytes));
	}
	
	public static void main(String[] args) {
		
		base64();
	}

}
