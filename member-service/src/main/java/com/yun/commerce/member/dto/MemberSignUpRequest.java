package com.yun.commerce.member.dto;

import com.yun.commerce.member.domain.Member;
import com.yun.commerce.module.Email;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberSignUpRequest {

  @NotNull
  private Email email;

  public Member toEntity() {
    return Member.signUp()
        .email(email)
        .build();

  }

}
