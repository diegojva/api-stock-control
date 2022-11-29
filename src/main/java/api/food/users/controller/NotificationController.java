package api.food.users.controller;

import api.food.users.model.Notification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    @GetMapping
    public List<Notification> getNotification(@RequestParam Long shopId){
        return null;
    }
}
