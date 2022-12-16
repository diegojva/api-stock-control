package api.food.users.service;

import api.food.users.dto.ProductDto;
import api.food.users.model.Notification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NotificationService {

    void sendNotification(ProductDto productDTO);

    Page<Notification> listPage(Pageable page);

}
