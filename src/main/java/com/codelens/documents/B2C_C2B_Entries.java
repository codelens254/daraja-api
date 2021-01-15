package com.codelens.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "b2c_c2b_entries")
@Data
public class B2C_C2B_Entries {

    @Id
    private String internalId;

    private String transactionType;

    @Indexed(unique = true)
    private String transactionId;

    private String billRefNumber;

    private String msisdn;

    private String amount;

    @Indexed(unique = true)
    private String conversationId;

    @Indexed(unique = true)
    private String originatorConversationId;

    private Date EntryDate;

    private String resultCode;

    private Object rawCallbackPayloadResponse;
}