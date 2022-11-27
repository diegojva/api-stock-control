package api.food.users.service.impl;

import api.food.users.dto.ProductDto;
import api.food.users.service.NotificationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

    @Override
    public Boolean sendNotification(ProductDto productDTO) {

        return null;
    }
}
