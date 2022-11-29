package api.food.users.service.impl;

import api.food.users.dto.ProductDto;
import api.food.users.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

    @Autowired private JavaMailSender mail;

    @Value("${spring.mail.username}")
    private String  emailFrom;


    @Override
    public void sendNotification(ProductDto productDTO) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("zuniga.andree@gmail.com");
        email.setFrom(emailFrom);
        email.setSubject("Alerta de inventario");
        email.setText("El producto "+productDTO.getProductName()+" de la tienda "+productDTO.getShopName()+" se esta quedando sin stock.");
        mail.send(email);
    }
}
