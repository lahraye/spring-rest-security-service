package org.ticcis.fullstack.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ticcis.fullstack.auth.AuthenticationBean;

@CrossOrigin(origins = {"http://localhost:8000","http://locahost:9000"})
@RestController
public class BasicAuthenticationController {
    @GetMapping(path = "/basicauth")
    public AuthenticationBean demoBean(){
        return new AuthenticationBean("Good, you've being authenticated");
    }
}
