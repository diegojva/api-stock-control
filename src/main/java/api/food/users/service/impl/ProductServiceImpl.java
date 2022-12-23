package api.food.users.service.impl;

import api.food.users.client.WarehouseClient;
import api.food.users.dto.ProductDto;
import api.food.users.dto.SaleDto;
import api.food.users.model.Product;
import api.food.users.service.NotificationService;
import api.food.users.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired private WarehouseClient warehouseClient;

    @Autowired private NotificationService notificationService;

    @Override
    public Boolean validateNotification(SaleDto saleDto) {
        Boolean hasNotification = false;
        for(Long productId : saleDto.getProducts()){
            ProductDto productDTO = warehouseClient.findProductEndpoint(saleDto.getShopId(),productId);
            if(productDTO.getStock()<50){
                hasNotification = Boolean.TRUE;
                notificationService.sendNotification(productDTO);
            }
        }
        return hasNotification;
    }

    @Override
    public List<ProductDto> getProductStockLow() {
        List<ProductDto> products = warehouseClient.getProduct();
        return products.stream().filter(p->p.getStock()<=20).collect(Collectors.toList());
    }

    @Override
    public Product getProductoById(Long id) {
        return warehouseClient.getProductById(id);
    }
}
