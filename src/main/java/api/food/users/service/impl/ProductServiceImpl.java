package api.food.users.service.impl;

import api.food.users.client.WarehouseClient;
import api.food.users.dto.ProductDto;
import api.food.users.dto.SaleDto;
import api.food.users.service.NotificationService;
import api.food.users.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired private WarehouseClient warehouseClient;

    @Autowired private NotificationService notificationService;

    @Override
    public Boolean validateNotification(SaleDto saleDto) {
        Boolean hasNotification = false;
        for(Long productId : saleDto.getProducts()){
            ProductDto productDTO = warehouseClient.findProductEndpoint(saleDto.getShopId(),productId);
            if(productDTO.getStock()<100){
                hasNotification = Boolean.TRUE;
                notificationService.sendNotification(productDTO);
            }
        }
        return hasNotification;
    }
}
