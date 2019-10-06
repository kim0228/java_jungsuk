package kafka.examplekafka;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProducerExample {
	public static String result;
	public static String finalResult;
	public static void main(String[] args) throws IOException {
		String header;
		try {
			Document doc = (Document)Jsoup.connect("https://finance.naver.com/marketindex/exchangeDailyQuote.nhn?marketindexCd=FX_USDKRW").get();
			Elements tableElements = doc.select("table");
			Elements tableHeaderEles = tableElements.select("thead tr th");
			System.out.println("headers");
			for (int i = 0; i < tableHeaderEles.size(); i++) {
				//  System.out.println(tableHeaderEles.get(i).text());
				header  = tableHeaderEles.get(i).text();
			}
			System.out.println();
			Elements tableRowElements = tableElements.select(":not(thead) tr");
			
			for (int i = 0; i < tableRowElements.size(); i++) {
				Element row = tableRowElements.get(i);
				// System.out.println(row);
				Elements rowItems = row.select("td");
				for (int j = 0; j < rowItems.size(); j++) {
					System.out.println(rowItems.get(j).text());
					result = rowItems.get(j).text();
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		///////////////////////////////////////////// kafka /////////////////////////////////////////////
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
//		System.out.print("kafka 전달 메시지 입력 :");
//		for(int i = 0; i<=5;i++) {
//			finalResult = result;
//			producer.send(new ProducerRecord<String, String>("ds-topic", finalResult));
//		}
//		producer.flush();
//		producer.close();
		}
	}

