package api.food.users.controller;

import api.food.users.dto.ProductDto;
import api.food.users.dto.SaleDto;
import api.food.users.model.Product;
import api.food.users.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
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

    @GetMapping("/product/{id}")
    public ResponseEntity <Product>getProducts(@PathVariable Long id){
        return ResponseEntity.ok(productService.getProductoById(id));
    }


}
