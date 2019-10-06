package kafka.examplekafka;

<<<<<<< HEAD
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
=======

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

>>>>>>> b204d5093c6a472c69f52b02840c8393aaa75628
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

<<<<<<< HEAD
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
=======
import scala.annotation.meta.field;

public class ProducerExample {
	public static String iframeContentDoc ;
	public static void main(String[] args) throws IOException {
		Document doc = (Document)Jsoup.connect("https://finance.naver.com/marketindex/exchangeDailyQuote.nhn?marketindexCd=FX_USDKRW").get();
		Element table = doc.select("body > .section_exchange > table").get(0);
		
		System.out.println(table);
		
//		String[] items = new String[] {"1$","5$","10$","50$","100$","250$","500$"};
//		for(Element row : test2) {
//			Iterator<Element> iterElem = row.getElementsByTag("td").iterator();
//			StringBuilder builder = new StringBuilder();
//			for(String item : items) {
//				builder.append(item + ":  " + iterElem.next().text() + "원" + "   \n");
//			}
//			// System.out.println(builder.toString());
//			exchangeRate = builder.toString();
//		}
//		System.out.println(exchangeRate);
		
////////////////////////////////////////////////////// 카프카/////////////////////////////////////////////		
>>>>>>> b204d5093c6a472c69f52b02840c8393aaa75628
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
<<<<<<< HEAD
//		System.out.print("kafka 전달 메시지 입력 :");
//		for(int i = 0; i<=5;i++) {
//			finalResult = result;
//			producer.send(new ProducerRecord<String, String>("ds-topic", finalResult));
//		}
=======
//		
//		for(int i = 0;i<1; i++){
//			 
//			producer.send(new ProducerRecord<String, String>("kopo-topic", exchangeRate));
//			System.out.println(exchangeRate);
//		}	
>>>>>>> b204d5093c6a472c69f52b02840c8393aaa75628
//		producer.flush();
//		producer.close();
		}
	}

