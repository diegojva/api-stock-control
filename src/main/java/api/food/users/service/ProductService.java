package api.food.users.service;

import api.food.users.dto.SaleDto;

public interface ProductService {
    Boolean validateNotification(SaleDto saleDto);
}
