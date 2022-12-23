package api.food.users.service.impl;

import api.food.users.model.OrderProduct;
import api.food.users.repository.OrderProductRepository;
import api.food.users.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Override
    public List<OrderProduct> getOrderProducts() {
        return orderProductRepository.findAll();
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return orderProductRepository.save(orderProduct);
    }
}
