package api.food.users.dto;

import lombok.Data;

import java.util.List;

@Data
public class SaleDto {
    Long shopId;
    List<Long> products;
}
