package com.sofka.devops.prechallenge.usecases.menudevops;

import com.sofka.devops.prechallenge.dto.MenuDevOpsDTO;
import com.sofka.devops.prechallenge.mapper.MenuDevOpsMapper;
import com.sofka.devops.prechallenge.repository.MenuDevOpsRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetAllMenuDevOpsUseCase {

    private final MenuDevOpsRepository repository;
    private final MenuDevOpsMapper mapper;

    public GetAllMenuDevOpsUseCase(MenuDevOpsRepository repository, MenuDevOpsMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Flux<MenuDevOpsDTO> apply() {
        return repository.findAll().map(menuDevOps -> mapper.toMenuDevOpsDTO(menuDevOps));
    }
}
