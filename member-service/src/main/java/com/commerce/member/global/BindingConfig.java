package com.commerce.member.global;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@EnableBinding(Processor.class)
public class BindingConfig {

}
