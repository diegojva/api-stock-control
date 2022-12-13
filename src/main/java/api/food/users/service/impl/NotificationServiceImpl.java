package api.food.users.service.impl;

import api.food.users.dto.ProductDto;
import api.food.users.model.Notification;
import api.food.users.repository.NotificationRepository;
import api.food.users.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

    @Autowired private JavaMailSender mail;

    @Value("${spring.mail.username}")
    private String  emailFrom;

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public void sendNotification(ProductDto productDTO) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("zuniga.andree@gmail.com");
        email.setFrom(emailFrom);
        email.setSubject("Alerta de inventario");
        email.setText("El producto "+productDTO.getProductName()+" de la tienda "+productDTO.getShopName()+" se esta quedando sin stock.");
        mail.send(email);
        saveNotification(email,productDTO);

    }

    private void saveNotification(SimpleMailMessage email,ProductDto productDto){
        Notification notification = new Notification();
        notification.setStock(productDto.getStock());
        notification.setSetTo(email.getTo()[0]);
        notification.setSetFrom(email.getFrom());
        notification.setSubject(email.getSubject());
        notification.setText(email.getText());
        notification.setSendDate(new Date());
        notification.setProductId(productDto.getProductId());
        notification.setShopId(productDto.getShopId());
        notification.setStock(productDto.getStock());
        notificationRepository.save(notification);
    }


}
