package ru.itis.webflux.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import ru.itis.webflux.client.Client;
import ru.itis.webflux.entity.Mail;

import java.util.List;

@Component
@AllArgsConstructor
public class MailServiceImpl implements Service {
    private final List<Client> clients;

    @Override
    public Flux<Mail> getMail() {
        List<Flux<Mail>> fluxes = clients.stream().map(this::getMail).toList();
        return Flux.merge((fluxes));
    }

    private Flux<Mail> getMail(Client client) {
        return client.getMail()
                .subscribeOn(Schedulers.boundedElastic());
    }

}
