package ru.itis.fast_mail_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.fast_mail_api.entity.Mail;

import java.util.List;

@RestController
@RequestMapping("/fast_mail")
public class FastMailController {

    @GetMapping("/all")
    public List<Mail> getAllMail() {
        return List.of(
                Mail.builder()
                        .title("Fast Mail 1")
                        .message("hello")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Fast Mail 2")
                        .message("world!")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Fast Mail 3")
                        .message("soon")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Fast Mail 4")
                        .message("I will be back")
                        .author("Огурчик Кунжутович")
                        .build(),
                Mail.builder()
                        .title("Fast Mail 5")
                        .message("bay")
                        .author("Огурчик Кунжутович")
                        .build()
        );
    }
}
