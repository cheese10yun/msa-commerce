package com.yun.commerce.member;

import com.yun.commerce.module.Email;
import java.util.UUID;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

  @Id
  private String id;

  @Embedded
  @AttributeOverride(name = "value", column = @Column(name = "email", nullable = false, unique = true, updatable = false, length = 50))
  private Email email;

  @Builder
  public Member(Email email) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
  }
}
