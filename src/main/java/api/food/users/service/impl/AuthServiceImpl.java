package api.food.users.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {

    public String getAuthetication() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
