package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//천호동
public class Server {

	public static void main(String[] args) throws IOException{

		//서버소켓 생성
		ServerSocket serverSocket = new ServerSocket();
		
		//바인드(세팅하는거) --> ip 192.168.0.80     port 10001
		
		/*
		InetSocketAddress ipPort= new InetSocketAddress("192.168.0.80" , 10001);
		serverSocket.bind();
		*/
		
		serverSocket.bind(new InetSocketAddress("192.168.0.80", 10001));
		
		//서버 시작
		System.out.println("<서버시작>");
		System.out.println("=======================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		//클라이언트가 연결되면 accept() 실행이 된다
		//socket 종이컵 전화기
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		//읽기 스트림 --> 메시지를 받는다
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//쓰기 스트림 준비
		OutputStream out = socket.getOutputStream();  //주 스트림
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner sc = new Scanner(System.in);
		//-----------
		while(true) {
			
		
			//메시지를 받는다
			String msg = br.readLine();
			
			if(msg == null) {
				break;
			}
			
			
			System.out.println("받은 메시지: "+ msg);
			
			//메시지를 보낸다
			bw.write(msg);
			bw.newLine();
			bw.flush();
			//-----------
			
		}
		
		
		
		System.out.println("=======================================");
		System.out.println("<서버종료>");
		
		//자원정리
		socket.close();
		serverSocket.close();
		sc.close();
		bw.close();
		br.close();
		
	}

}
