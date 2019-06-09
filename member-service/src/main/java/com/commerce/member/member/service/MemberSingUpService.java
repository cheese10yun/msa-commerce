package com.commerce.member.member.service;

import com.commerce.member.infra.noti.MemberSignUp;
import com.commerce.member.member.dao.MemberRepository;
import com.commerce.member.member.domain.Member;
import com.commerce.member.member.dto.MemberSignUpRequest;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberSingUpService {

  private final MemberRepository memberRepository;
  private final MemberSignUp memberSignup;

  @Transactional
  public Member signUp(final MemberSignUpRequest dto) {
    final Member member = memberRepository.save(dto.toEntity());

    final boolean send = memberSignup.send(member);

    return member;
  }

}
