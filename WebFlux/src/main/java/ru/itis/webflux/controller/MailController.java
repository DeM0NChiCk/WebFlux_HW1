package ru.itis.webflux.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.itis.webflux.entity.Mail;
import ru.itis.webflux.service.Service;

@AllArgsConstructor
@RestController
@RequestMapping("/mail")
public class MailController {
    private final Service service;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Mail> getMail() {
        return service.getMail();
    }
}
