package ru.itis.webflux.service;

import reactor.core.publisher.Flux;
import ru.itis.webflux.entity.Mail;

public interface Service {
    Flux<Mail> getMail();
}
