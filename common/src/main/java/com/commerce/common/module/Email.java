package com.commerce.common.module;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Email {

  @javax.validation.constraints.Email
  @Column(name = "email", length = 50)
  @NotEmpty
  private String value;

  private Email(final String value) {
    this.value = value;
  }

  public static Email of(final String value) {
    return new Email(value);
  }

  public String getHost() {
    final int index = value.indexOf("@");
    return index == -1 ? null : value.substring(index + 1);
  }

  public String getId() {
    final int index = value.indexOf("@");
    return index == -1 ? null : value.substring(0, index);
  }

}
