package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class B2CTransactionRequest{

	@JsonProperty("QueueTimeOutURL")
	private String queueTimeOutURL;

	@JsonProperty("Remarks")
	private String remarks;

	@JsonProperty("Amount")
	private String amount;

	@JsonProperty("InitiatorName")
	private String initiatorName;

	@JsonProperty("SecurityCredential")
	private String securityCredential;

	@JsonProperty("Occassion")
	private String occassion;

	@JsonProperty("CommandID")
	private String commandID;

	@JsonProperty("PartyA")
	private String partyA;

	@JsonProperty("PartyB")
	private String partyB;

	@JsonProperty("ResultURL")
	private String resultURL;
}