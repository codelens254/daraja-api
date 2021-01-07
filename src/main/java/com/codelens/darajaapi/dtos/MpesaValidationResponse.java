package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MpesaValidationResponse{

	@JsonProperty("TransactionType")
	private String transactionType;

	@JsonProperty("BillRefNumber")
	private String billRefNumber;

	@JsonProperty("MSISDN")
	private String mSISDN;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("MiddleName")
	private String middleName;

	@JsonProperty("BusinessShortCode")
	private String businessShortCode;

	@JsonProperty("OrgAccountBalance")
	private String orgAccountBalance;

	@JsonProperty("TransAmount")
	private String transAmount;

	@JsonProperty("ThirdPartyTransID")
	private String thirdPartyTransID;

	@JsonProperty("InvoiceNumber")
	private String invoiceNumber;

	@JsonProperty("LastName")
	private String lastName;

	@JsonProperty("TransID")
	private String transID;

	@JsonProperty("TransTime")
	private String transTime;
}