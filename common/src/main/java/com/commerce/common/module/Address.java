package com.commerce.common.module;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Address {

  @Column(name = "address_street")
  private String street;

  @Column(name = "address_detail")
  private String detail;

  @Column(name = "address_zip_code")
  private String zipCode;

  @Builder
  public Address(final String street, final String detail, final String zipCode) {
    this.street = street;
    this.detail = detail;
    this.zipCode = zipCode;
  }
}
