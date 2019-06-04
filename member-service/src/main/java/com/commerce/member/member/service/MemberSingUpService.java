package com.commerce.member.member.service;

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

  @Transactional
  public Member signUp(final MemberSignUpRequest dto) {
    return memberRepository.save(dto.toEntity());
  }

}
