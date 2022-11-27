package api.food.users.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long productId;
    private String productName;
    private Long shopId;
    private String shopName;
    private Double stock;
}
