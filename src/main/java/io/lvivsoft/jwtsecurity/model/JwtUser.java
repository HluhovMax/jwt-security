package io.lvivsoft.jwtsecurity.model;

import lombok.Data;

@Data
public class JwtUser {
    private Long id;
    private String userName;
    private String role;
}
