package api.food.users.service.impl;

import api.food.users.model.OrderProduct;
import api.food.users.model.User;
import api.food.users.repository.OrderProductRepository;
import api.food.users.service.OrderProductService;
import api.food.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Autowired
    private UserService userService;

    @Override
    public List<OrderProduct> getOrderProducts() {
        return orderProductRepository.findAll();
    }

    @Override
    public OrderProduct registrar(OrderProduct orderProduct, String username) {
        User user = userService.getUserByUsername(username);
        orderProduct.setCreated(new Date());
        orderProduct.setUpdated(new Date());
        orderProduct.setState("Solicitado");
        orderProduct.setDescription("Solicitud enviada al almacen central");
        orderProduct.setUser(user);
        return orderProductRepository.save(orderProduct);
    }
}
