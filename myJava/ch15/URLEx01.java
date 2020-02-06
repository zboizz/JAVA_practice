package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx01 {
	public static void main(String[] args) {
		String spec ="http://daum.com";
		try {
		URL url = new URL(spec);
		
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("Host : " + url.getHost());
		System.out.println("Port : " + url.getPort());
		System.out.println("Path : " + url.getPath());
		System.out.println("Query : "+ url.getQuery());
		System.out.println("Filename : "+ url.getFile());
		System.out.println("Ref : " + url.getRef());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
		
		String line = "";
		while(true) {
			line = br.readLine();
			if(line==null) break;
			System.out.println(line);
			
		}
		br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
