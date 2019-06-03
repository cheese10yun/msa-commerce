package com.yun.commerce.member;

import com.yun.commerce.module.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberApi {

  private final MemberRepository memberRepository;

  @PostMapping
  public Member signUp(){

    final Member member = Member.builder().email(Email.of("asd@asd.com")).build();
    return memberRepository.save(member);
  }

}
