package api.food.users.service;

import api.food.users.dto.ProductDto;

public interface NotificationService {

    void sendNotification(ProductDto productDTO);

}
