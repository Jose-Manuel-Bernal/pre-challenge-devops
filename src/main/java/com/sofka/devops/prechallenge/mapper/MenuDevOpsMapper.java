package com.sofka.devops.prechallenge.mapper;

import com.sofka.devops.prechallenge.dto.MenuDevOpsDTO;
import com.sofka.devops.prechallenge.entity.MenuDevOps;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
public class MenuDevOpsMapper {

    private final ModelMapper modelMapper;

    public MenuDevOpsMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MenuDevOpsDTO toMenuDevOpsDTO(MenuDevOps menuDevOps) {
        return modelMapper.map(menuDevOps, MenuDevOpsDTO.class);
    }

    public MenuDevOps toMenuDevOpsEntity(MenuDevOpsDTO menuDevOpsDTO) {
        return modelMapper.map(menuDevOpsDTO, MenuDevOps.class);
    }
}
