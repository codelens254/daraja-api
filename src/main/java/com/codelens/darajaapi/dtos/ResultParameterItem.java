package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultParameterItem{

	@JsonProperty("Value")
	private String value;

	@JsonProperty("Key")
	private String key;
}