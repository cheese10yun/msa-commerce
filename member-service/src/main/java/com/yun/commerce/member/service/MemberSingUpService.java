package com.yun.commerce.member.service;

import com.yun.commerce.member.dao.MemberRepository;
import com.yun.commerce.member.domain.Member;
import com.yun.commerce.member.dto.MemberSignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberSingUpService {

  private final MemberRepository memberRepository;

  @Transactional
  public Member signUp(final MemberSignUpRequest dto) {
    return memberRepository.save(dto.toEntity());
  }

}
