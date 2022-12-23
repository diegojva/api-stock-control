package api.food.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductDto {
    private Long idProduct;
    private String productName;
    private Long shopId;
    private String shopName;
    private Double cant;
    private Date created;
    private Date updated;
    private String state;
    private String description;
    private String username;
}
