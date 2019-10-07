package com.commerce.member.infra.noti;


import com.commerce.member.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberSignUp {

  private final Source source;


  public boolean send(final Member member) {
    return source.output().send(MessageBuilder.withPayload(member).build());

  }

}
