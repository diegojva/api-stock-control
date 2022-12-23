package api.food.users.controller;

import api.food.users.model.OrderProduct;
import api.food.users.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OrderProduct/v1")
public class OrderProductController {

    @Autowired
    private OrderProductService orderProductService;

    @GetMapping
    public ResponseEntity<List<OrderProduct>> getOrderProducts(){
        List<OrderProduct> orderProductList = orderProductService.getOrderProducts();
        return ResponseEntity.ok(orderProductList);
    }

    @PostMapping
    public ResponseEntity<OrderProduct> register(@RequestBody OrderProduct orderProduct){
        OrderProduct orderProductCreated = orderProductService.create(orderProduct);
        return ResponseEntity.ok(orderProductCreated);
    }

}
