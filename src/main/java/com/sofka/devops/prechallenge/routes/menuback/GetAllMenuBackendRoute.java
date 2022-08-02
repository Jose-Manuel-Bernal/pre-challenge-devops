package com.sofka.devops.prechallenge.routes.menuback;

import com.sofka.devops.prechallenge.entity.MenuBackend;
import com.sofka.devops.prechallenge.usecases.menuback.GetAllMenuBackendUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GetAllMenuBackendRoute {

    @Bean
    public RouterFunction<ServerResponse> getAllBack(GetAllMenuBackendUseCase useCase) {
        return route(GET("/menuBack/get/all"),
                request -> ServerResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromProducer(useCase.apply(), MenuBackend.class)));
    }
}
