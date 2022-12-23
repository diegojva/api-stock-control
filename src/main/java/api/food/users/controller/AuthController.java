package api.food.users.controller;

import api.food.users.service.impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/user")
    public ResponseEntity<String> getAuthetication() {
        return  ResponseEntity.ok(authService.getAuthetication());
    }
}
