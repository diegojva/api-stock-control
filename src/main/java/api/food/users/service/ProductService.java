package api.food.users.service;

import api.food.users.dto.ProductDto;
import api.food.users.dto.SaleDto;
import api.food.users.model.Product;

import java.util.List;

public interface ProductService {
    Boolean validateNotification(SaleDto saleDto);

    List<ProductDto> getProductStockLow();

    Product getProductoById(Long id);
}
