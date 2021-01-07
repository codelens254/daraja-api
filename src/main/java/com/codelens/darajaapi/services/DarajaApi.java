package com.codelens.darajaapi.services;

import com.codelens.darajaapi.dtos.AccessTokenResponse;
import com.codelens.darajaapi.dtos.RegisterUrlResponse;
import com.codelens.darajaapi.dtos.SimulateTransactionRequest;
import com.codelens.darajaapi.dtos.SimulateTransactionResponse;

public interface DarajaApi {

    /**
     * @return Returns Daraja API Access Token Response
     */
    AccessTokenResponse getAccessToken();

    RegisterUrlResponse registerUrl();

    SimulateTransactionResponse simulateC2BTransaction(SimulateTransactionRequest simulateTransactionRequest);

}
