package api.food.users.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProduct;
    private String productName;
    private Long shopId;
    private String shopName;
    private Double cant;
    private Date created;
    private Date updated;
    private String state;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id_user")
    private User user;

}
