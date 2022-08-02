package com.sofka.devops.prechallenge.usecases.menuback;

import com.sofka.devops.prechallenge.dto.MenuBackendDTO;
import com.sofka.devops.prechallenge.mapper.MenuBackendMapper;
import com.sofka.devops.prechallenge.repository.MenuBackendRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetAllMenuBackendUseCase {

    private final MenuBackendRepository repository;
    private final MenuBackendMapper mapper;

    public GetAllMenuBackendUseCase(MenuBackendRepository repository, MenuBackendMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Flux<MenuBackendDTO> apply() {
        return repository.findAll().map(menuBackend -> mapper.toMenuBackDTO(menuBackend));
    }
}
