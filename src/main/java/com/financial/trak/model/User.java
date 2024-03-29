package com.financial.trak.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter @Document
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    private Entry account;
}
