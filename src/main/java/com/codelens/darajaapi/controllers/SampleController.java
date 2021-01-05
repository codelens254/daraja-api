package com.codelens.darajaapi.controllers;

import com.codelens.darajaapi.dtos.AccessTokenResponse;
import com.codelens.darajaapi.services.DarajaApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleController {

    private final DarajaApi darajaApi;

    public SampleController(DarajaApi darajaApi) {
        this.darajaApi = darajaApi;
    }

    @GetMapping(path = "/token", produces = "application/json")
    public ResponseEntity<AccessTokenResponse> getSampleMessage() {
        AccessTokenResponse accessTokenResponse = darajaApi.getAccessToken();
        return ResponseEntity.ok(accessTokenResponse);
    }
}
