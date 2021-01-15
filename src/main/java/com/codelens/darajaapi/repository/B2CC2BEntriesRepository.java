package com.codelens.darajaapi.repository;

import com.codelens.documents.B2C_C2B_Entries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface B2CC2BEntriesRepository extends MongoRepository<B2C_C2B_Entries, String> {

    // Find Record By ConversationID or OriginatorConversationID ...
    B2C_C2B_Entries findByConversationIdOrOriginatorConversationId(String conversationId, String originatorConversationId);

    // Find Transaction By TransactionId ....
    B2C_C2B_Entries findByTransactionId(String transactionId);

    B2C_C2B_Entries findByBillRefNumber(String billRefNumber);

}
