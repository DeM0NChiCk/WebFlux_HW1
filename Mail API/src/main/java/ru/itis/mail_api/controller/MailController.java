package ru.itis.mail_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.mail_api.entity.Mail;

import java.util.List;

@RestController
@RequestMapping("/mail")
public class MailController {


    @GetMapping("/all")
    public List<Mail> getAllMail() throws InterruptedException {
        Thread.sleep(5000);
        return List.of(
                Mail.builder()
                        .title("Mail 1")
                        .message("hello")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Mail 2")
                        .message("world!")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Mail 3")
                        .message("soon")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Mail 4")
                        .message("I will be back")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Mail 5")
                        .message("bay")
                        .author("Огурчик Кунжутович")
                        .build()
        );
    }
}
