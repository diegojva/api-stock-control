package api.food.users.controller;

import api.food.users.model.Notification;
import api.food.users.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notifications/v1")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;
    @GetMapping
    public List<Notification> getNotification(@RequestParam Long shopId){
        return null;
    }

    @GetMapping("/pageable")
    public ResponseEntity<Page<Notification>> listPage(Pageable pageable){

        Page<Notification> notifications = notificationService.listPage(pageable);

        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }
}
