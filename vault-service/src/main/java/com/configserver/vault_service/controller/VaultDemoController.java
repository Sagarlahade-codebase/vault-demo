package com.configserver.vault_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultDemoController {

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @GetMapping("/vault-creds")
    public String getVaultCreds() {
        return "Username: " + username + ", Password: " + password;
    }
}
