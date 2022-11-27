package api.food.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@SpringBootApplication
@EnableFeignClients
public class ApiUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiUsersApplication.class, args);
    }

    @GetMapping("/user")
    public Principal getUser(Principal user) {
        return user;
    }

}
