package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionStatusSyncResponse{

	@JsonProperty("ConversationID")
	private String conversationID;

	@JsonProperty("ResponseCode")
	private String responseCode;

	@JsonProperty("OriginatorConversationID")
	private String originatorConversationID;

	@JsonProperty("ResponseDescription")
	private String responseDescription;
}