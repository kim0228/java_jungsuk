package httptest;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class TcpIpClient {
	public static void main(String[] args) throws UnknownHostException, IOException{
		// 연결하기 위한 소켓 생성
		Socket socket = new Socket("10.10.10.10", 7777);
		
		// 입력스트림
		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		
		// 데이터 출력
		System.out.println("[Server]" + din.readUTF());
		
		din.close();
		socket.close();
	}
}
