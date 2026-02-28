package com.example.Spring_boot_jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringBootJenkinsApplicationTests {


	@Test
	void contextLoads() {
        log.info("contextLoads test case executed");
		log.info("test case executed");
		assertEquals(1,1);
		assertEquals(2,2);

	}
}
