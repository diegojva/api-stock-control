package api.food.users.service;

import api.food.users.dto.OrderProductDto;
import api.food.users.model.OrderProduct;

import java.util.List;

public interface OrderProductService {

    List<OrderProduct> getOrderProducts();
    OrderProduct registrar(OrderProductDto orderProductDto);
}
