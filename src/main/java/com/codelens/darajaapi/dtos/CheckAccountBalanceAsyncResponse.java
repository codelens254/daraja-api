package com.codelens.darajaapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckAccountBalanceAsyncResponse {

    @JsonProperty("Result")
    private Result result;
}
