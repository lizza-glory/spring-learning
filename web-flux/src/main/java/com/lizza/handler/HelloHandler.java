package com.lizza.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-01-26
 */
@Component
public class HelloHandler {

    public Mono<ServerResponse> hello(ServerRequest msg) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("您输入的是: " + msg));
    }
}
