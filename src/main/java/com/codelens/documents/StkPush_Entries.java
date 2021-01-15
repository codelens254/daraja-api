package com.codelens.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "stk_push_entries")
@Data
public class StkPush_Entries {

    @Id
    private String internalId;

    @Indexed(unique = true)
    private String transactionId;

    private String transactionType;

    private String msisdn;

    private Long amount;

    @Indexed(unique = true)
    private String merchantRequestID;

    @Indexed(unique = true)
    private String checkoutRequestID;

    private Date entryDate;

    private String resultCode;

    private String rawCallbackPayloadResponse;

}