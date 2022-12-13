package api.food.users.controller;

import api.food.users.dto.ProductDto;
import api.food.users.dto.SaleDto;
import api.food.users.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/validate-notification")
    public ResponseEntity<Boolean> validateNotification(@RequestBody SaleDto saleDto){
        Boolean hasNotification = productService.validateNotification(saleDto);
        return ResponseEntity.ok(hasNotification);
    }

    @GetMapping("/products-stock-low")
    public ResponseEntity<List<ProductDto>> getProducts(){
        return ResponseEntity.ok(productService.getProductStockLow());
    }
}
