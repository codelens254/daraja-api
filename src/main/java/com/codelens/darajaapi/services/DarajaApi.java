package com.codelens.darajaapi.services;

import com.codelens.darajaapi.dtos.*;

public interface DarajaApi {

    /**
     * @return Returns Daraja API Access Token Response
     */
    AccessTokenResponse getAccessToken();

    RegisterUrlResponse registerUrl();

    SimulateTransactionResponse simulateC2BTransaction(SimulateTransactionRequest simulateTransactionRequest);

    B2CTransactionSyncResponse performB2CTransaction(B2CTransactionRequest b2CTransactionRequest);
}
