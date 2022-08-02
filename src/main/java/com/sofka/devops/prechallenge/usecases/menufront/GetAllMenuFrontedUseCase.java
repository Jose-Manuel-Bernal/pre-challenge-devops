package com.sofka.devops.prechallenge.usecases.menufront;

import com.sofka.devops.prechallenge.dto.MenuFrontendDTO;
import com.sofka.devops.prechallenge.mapper.MenuFrontedMapper;
import com.sofka.devops.prechallenge.repository.MenuFrontedRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetAllMenuFrontedUseCase {

    private final MenuFrontedRepository repository;
    private final MenuFrontedMapper mapper;

    public GetAllMenuFrontedUseCase(MenuFrontedRepository repository, MenuFrontedMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Flux<MenuFrontendDTO> apply() {
        return repository.findAll().map(menuFrontend -> mapper.toMenuFrontendDTO(menuFrontend));
    }
}
