package com.example.demo;


import com.example.constants.KafkaConsts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	/**
	 * test send msg
	 */
	@Test
	public void testSend() {
		kafkaTemplate.send(KafkaConsts.TOPIC_TEST, "hello, kafka...");
	}
}
