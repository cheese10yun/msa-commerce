package com.commerce.notification;


import com.commerce.member.member.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBinding(Processor.class)
@EnableDiscoveryClient
public class NotificationApplication {

  public static void main(String[] args) {
    SpringApplication.run(NotificationApplication.class, args);
  }

//  @Bean
  @StreamListener(Processor.INPUT)
  public void receiveSignUp(final Member member){
    System.out.println("11111");
  }

}
