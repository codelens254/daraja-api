package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Result{

	@JsonProperty("ConversationID")
	private String conversationID;

	@JsonProperty("ReferenceData")
	private ReferenceData referenceData;

	@JsonProperty("OriginatorConversationID")
	private String originatorConversationID;

	@JsonProperty("ResultDesc")
	private String resultDesc;

	@JsonProperty("ResultType")
	private int resultType;

	@JsonProperty("ResultCode")
	private int resultCode;

	@JsonProperty("ResultParameters")
	private ResultParameters resultParameters;

	@JsonProperty("TransactionID")
	private String transactionID;
}