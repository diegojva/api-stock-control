package api.food.users.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date sendDate;
    private Long productId;
    private String productName;
    private Long shopId;
    private String shopName;
    private Double stock;
    private String setTo;
    private String setFrom;
    private String subject;
    private String text;
}
