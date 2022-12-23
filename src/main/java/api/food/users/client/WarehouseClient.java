package api.food.users.client;

import api.food.users.dto.ProductDto;
import api.food.users.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="inventory-client", url="${app.config.apiWarehouse}")
public interface WarehouseClient {

    @GetMapping("${app.config.findProductEndpoint}")
    ProductDto findProductEndpoint(@PathVariable("shopId") Long shopId, @PathVariable("productId") Long productId);

    @GetMapping("/products")
    List<ProductDto> getProduct();

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id);
}
