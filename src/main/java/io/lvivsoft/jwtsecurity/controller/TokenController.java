package io.lvivsoft.jwtsecurity.controller;

import io.lvivsoft.jwtsecurity.model.JwtUser;
import io.lvivsoft.jwtsecurity.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        String s = jwtGenerator.generate(jwtUser);
        return s;
    }
}
