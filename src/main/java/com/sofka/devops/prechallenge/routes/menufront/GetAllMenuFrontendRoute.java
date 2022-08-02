package com.sofka.devops.prechallenge.routes.menufront;

import com.sofka.devops.prechallenge.entity.MenuFrontend;
import com.sofka.devops.prechallenge.usecases.menufront.GetAllMenuFrontedUseCase;
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
public class GetAllMenuFrontendRoute {

    @Bean
    public RouterFunction<ServerResponse> getAllFront(GetAllMenuFrontedUseCase useCase) {
        return route(GET("/menuFront/get/all"),
                request -> ServerResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromProducer(useCase.apply(), MenuFrontend.class)));
    }
}
