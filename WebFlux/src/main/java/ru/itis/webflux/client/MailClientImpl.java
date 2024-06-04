package ru.itis.webflux.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.itis.webflux.entity.Mail;

import java.util.Arrays;

@Component
public class MailClientImpl implements Client{

    private final WebClient client;

    public MailClientImpl(@Value("${mail.api.url}") String url) {
        client = WebClient.builder()
                .baseUrl(url)
                .build();
    }

    @Override
    public Flux<Mail> getMail(){
        return client.get()
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(Mail[].class))
                .flatMapIterable(Arrays::asList);
    }

}
