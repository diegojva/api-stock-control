package api.food.users.service.impl;

import api.food.users.dto.OrderProductDto;
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
    public OrderProduct registrar(OrderProductDto orderProductDto) {

        User user = userService.getUserByUsername(orderProductDto.getUsername());

        OrderProduct orderProduct = OrderProduct.builder()
                .productName(orderProductDto.getProductName())
                .idProduct(orderProductDto.getIdProduct())
                .shopId(orderProductDto.getShopId())
                .shopName(orderProductDto.getShopName())
                .cant(orderProductDto.getCant())
                .created(new Date())
                .updated(new Date())
                .state("Solicitado")
                .description("Solicitud enviada al almacen central")
                .user(user)
                .build();

        return orderProductRepository.save(orderProduct);
    }
}
