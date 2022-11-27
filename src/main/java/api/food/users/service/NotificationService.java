package api.food.users.service;

import api.food.users.dto.ProductDto;

public interface NotificationService {

    Boolean sendNotification(ProductDto productDTO);

}
