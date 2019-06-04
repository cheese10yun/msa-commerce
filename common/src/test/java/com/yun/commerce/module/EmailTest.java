package com.yun.commerce.module;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

import com.commerce.common.module.Email;
import org.junit.Assert;
import org.junit.Test;

public class EmailTest {

  @Test
  public void Email_test() {
    final String value = "cheese10yun@gmail.com";
    final Email email = Email.of(value);
    Assert.assertThat(email.getValue(), is(value));
    Assert.assertThat(email.getId(), is("cheese10yun"));
    Assert.assertThat(email.getHost(), is("gmail.com"));
  }

  @Test
  public void Email_Invalidation() {
    final String value = "cheese1gmail.com";
    final Email email = Email.of(value);
    Assert.assertThat(email.getValue(), is(value));
    Assert.assertThat(email.getHost(), is(nullValue()));
    Assert.assertThat(email.getId(), is(nullValue()));
  }

  @Test
  public void Email_Invalidation_test() {
    final String value = "chees@e1gmailm";
    final Email email = Email.of(value);
    Assert.assertThat(email.getValue(), is(value));
    Assert.assertThat(email.getId(), is("chees"));
    Assert.assertThat(email.getHost(), is("e1gmailm"));
  }

  @Test
  public void Email_Invalidation_test_01() {
    final String value = "@asd.com";
    final Email email = Email.of(value);
    Assert.assertThat(email.getValue(), is(value));
    Assert.assertThat(email.getId(), is(""));
    Assert.assertThat(email.getHost(), is("asd.com"));
  }

}