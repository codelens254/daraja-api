package com.codelens.darajaapi.services;

import com.codelens.darajaapi.dtos.AccessTokenResponse;

public interface DarajaApi {

    /**
     * @return
     */
    AccessTokenResponse getAccessToken();
}
