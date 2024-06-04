package ru.itis.webflux.client;

import reactor.core.publisher.Flux;
import ru.itis.webflux.entity.Mail;

public interface Client {
    Flux<Mail> getMail();
}
