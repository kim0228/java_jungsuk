package kafka.examplekafka;

import java.io.IOException;

import java.util.Iterator;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProducerExample {

	public static void main(String[] args) throws IOException {
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet httpget = new HttpGet("https://sports.news.naver.com/wfootball/record/index.nhn?category=epl&tab=team");
		try {
			httpClient.execute(httpget, new BasicResponseHandler() {
				@Override
				public String handleResponse(HttpResponse response) throws HttpResponseException, IOException {
					// 웹페이지를 그냥 갖어오면 한글이 깨져요. 인코딩 처리를 해야해요.
					String res = new String(super.handleResponse(response).getBytes("8859_1"), "euc-kr");
					Document doc = Jsoup.parse(res);
					Elements rows = doc.select(".record .record_tbl");
//					String[] items = new String[] { "순위", "팀", "경기수", "승", "무", "패", "득점", "실점", "득실차" };
//					for (Element row : rows) {
//						Iterator<Element> iterElem = row.getElementsByTag("td").iterator();
//						StringBuilder builder = new StringBuilder();
//						for (String item : items) {
//							builder.append(item + ": " + iterElem.next().text() + "   \t");
//						}
//						System.out.println(builder.toString());
//					}
					System.out.println(rows);
					return res;
			}
				
			});
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

//		Properties configs = new Properties();
//		configs.put("bootstrap.servers", "192.168.0.30:9092,192.168.0.31:9092,192.168.0.32:9092"); // kafka host 및
//		configs.put("acks", "all"); // 자신이 보낸 메시지에 대해 카프카로부터 확인을 기다리지 않습니다.
//		configs.put("block.on.buffer.full", "true"); // 서버로 보낼 레코드를 버퍼링 할 때 사용할 수 있는 전체 메모리의 바이트수
//		configs.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // serialize 설정
//		configs.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // serialize 설정
//
//		// producer 생성
//		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(configs);
//
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("kafka 전달 메시지 입력 :");
//			String i = sc.nextLine();
//			producer.send(new ProducerRecord<String, String>("search", i));
//
//			if (i.equals("exit")) {
//				break;
//			}
//		}
//		producer.flush();
//		producer.close();

	}
}
