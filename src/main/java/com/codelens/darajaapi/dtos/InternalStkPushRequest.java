package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InternalStkPushRequest{

	@JsonProperty("Amount")
	private String amount;

	@JsonProperty("PhoneNumber")
	private String phoneNumber;
}