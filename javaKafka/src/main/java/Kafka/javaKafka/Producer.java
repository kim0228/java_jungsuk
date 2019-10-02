package Kafka.javaKafka;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Producer {
	public static void main(String[] args) throws IOException {
		
		Properties configs = new Properties();
		configs.put("bootstrap.servers", "192.168.0.30:9092,192.168.0.31:9092,192.168.0.32:9092"); // kafka host 및 server 설정
		configs.put("acks", "all");                         // 자신이 보낸 메시지에 대해 카프카로부터 확인을 기다리지 않습니다.
		configs.put("block.on.buffer.full", "true");        // 서버로 보낼 레코드를 버퍼링 할 때 사용할 수 있는 전체 메모리의 바이트수
		configs.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");   // serialize 설정
		configs.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer"); // serialize 설정

		// producer 생성
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(configs);

		Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("kafka 전달 메시지 입력 :");
				String i = sc.nextLine();
				producer.send(new ProducerRecord<String, String>("java222", i));
			
							if(i.equals("exit"))
							{
								break;
							}
						}
						producer.flush();
						producer.close();
						}
					}
