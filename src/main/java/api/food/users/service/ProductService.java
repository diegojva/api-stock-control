package api.food.users.service;

import api.food.users.dto.ProductDto;
import api.food.users.dto.SaleDto;

import java.util.List;

public interface ProductService {
    Boolean validateNotification(SaleDto saleDto);

    List<ProductDto> getProductStockLow();
}
