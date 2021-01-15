package com.codelens.darajaapi.repository;

import com.codelens.documents.StkPush_Entries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StkPushEntriesRepository extends MongoRepository<StkPush_Entries, String> {

    //  Find Record By MerchantRequestID or CheckoutRequestID ...
    StkPush_Entries findByMerchantRequestIDOrCheckoutRequestID(String merchantRequestID, String checkoutRequestID);

    // Find Transaction By TransactionId ...
    StkPush_Entries findByTransactionId(String transactionId);
}
