package com.iky.travel;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class TravelBeApplicationTests {

  ApplicationContext context;

  @Test
  void contextLoads() {
    assertNotNull(context);
  }

}
