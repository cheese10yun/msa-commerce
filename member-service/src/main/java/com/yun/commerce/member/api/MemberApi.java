package com.yun.commerce.member.api;

import com.yun.commerce.member.domain.Member;
import com.yun.commerce.member.dto.MemberSignUpRequest;
import com.yun.commerce.member.service.MemberSingUpService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("members")
@RequiredArgsConstructor
public class MemberApi {

  private final MemberSingUpService memberSingUpService;

  @PostMapping
  public Member signUp(@RequestBody @Valid final MemberSignUpRequest dto) {
    return memberSingUpService.signUp(dto);
  }

}
