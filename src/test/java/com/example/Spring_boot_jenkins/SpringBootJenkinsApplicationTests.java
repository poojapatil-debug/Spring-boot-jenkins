package com.example.Spring_boot_jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.Spring_boot_jenkins.SpringBootJenkinsApplication.logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringBootJenkinsApplicationTests {


	@Test
	void contextLoads() {
		log.info("test case executed");
		assertEquals(1,1);
	}
}
