import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WebSocket {
	ServerSocket myServerSocket;
	boolean ServerOn = true;

	public WebSocket() { // 8888포트로 소켓 연결시도
		try {
			myServerSocket = new ServerSocket(8888);
		} catch (IOException ioe) {
			System.out.println("8888로 연결 안됨.");
			System.exit(-1);
		}

		// 오늘 날짜를 출력해주는 부분
		Calendar now = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("It is now : " + formatter.format(now.getTime()));

		while (ServerOn) {
			try {
				Socket clientSocket = myServerSocket.accept(); // 클라이언트가 접속을 시도하면 accept메소드가 클라이언트의 socket을 반환
				ClientServiceThread cliThread = new ClientServiceThread(clientSocket);
				cliThread.start();
			} catch (IOException ioe) {
				System.out.println("Exception found on accept. Ignoring. Stack Trace :");
				ioe.printStackTrace();
			}
		}
		try {
			myServerSocket.close();
			System.out.println("Server stopped");
		} catch (Exception ioe) {
			System.out.println("Error Found stopping server socket");
			System.exit(-1);
		}
	}

	public static void main(String[] args) {
		new WebSocket();
	}

	class ClientServiceThread extends Thread {
		Socket myClientSocket;
		boolean m_bRunThread = true;

		public ClientServiceThread() {
			super();
		}

		ClientServiceThread(Socket s) {
			myClientSocket = s;
		}

		public void run() {
			BufferedReader in = null;
			PrintWriter out = null;
			System.out.println("Accepted Client Address - " + myClientSocket.getInetAddress().getHostName());
			try {
				in = new BufferedReader(new InputStreamReader(myClientSocket.getInputStream()));
				out = new PrintWriter(new OutputStreamWriter(myClientSocket.getOutputStream()));

				while (m_bRunThread) {
					String clientCommand = in.readLine();
					System.out.println("Client Says :" + clientCommand);

					if (!ServerOn) {
						System.out.print("Server has already stopped");
						out.println("Server has already stopped");
						out.flush();
						m_bRunThread = false;
					}
					if (clientCommand.equalsIgnoreCase("quit")) {
						m_bRunThread = false;
						System.out.print("Stopping client thread for client : ");
					} else if (clientCommand.equalsIgnoreCase("end")) {
						m_bRunThread = false;
						System.out.print("Stopping client thread for client : ");
						ServerOn = false;
					} else {
						out.println("Server Says : " + clientCommand);
						out.flush();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					in.close();
					out.close();
					myClientSocket.close();
					System.out.println("...Stopped");
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
}